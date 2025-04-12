const Order = require('../models/order');

// Tạo đơn hàng mới
const createOrder = async (req, res) => {
  try {
    const { products } = req.body; // [{ productId, quantity }, {...}]

    if (!products || !Array.isArray(products) || products.length === 0) {
      return res.status(400).json({ message: 'Products array is required' });
    }

    const newOrder = new Order({ products });
    await newOrder.save();

    res.status(201).json(newOrder);
  } catch (error) {
    console.error('❌ Error creating order:', error);
    res.status(500).json({ message: 'Error creating order', error: error.message });
  }
};

// Lấy tất cả đơn hàng
const getAllOrders = async (req, res) => {
  try {
    const orders = await Order.find();
    res.status(200).json(orders);
  } catch (error) {
    res.status(500).json({ message: 'Error fetching orders', error });
  }
};

module.exports = { createOrder, getAllOrders };
