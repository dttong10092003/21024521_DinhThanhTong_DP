const Product = require('../models/product');

// Tạo sản phẩm mới
const createProduct = async (req, res) => {
  try {
    const { name, description, price, stock } = req.body;
    const newProduct = new Product({ name, description, price, stock });
    await newProduct.save();
    res.status(201).json(newProduct);
  } catch (error) {
    res.status(500).json({ message: 'Error creating product', error });
  }
};

let retryCount = 0;

const getAllProducts = async (req, res) => {
  try {
    // Giả lập lỗi tạm thời 2 lần đầu
    if (retryCount < 2) {
      retryCount++;
      throw new Error('Force error for retry test');
    }

    const products = await Product.find();
    res.status(200).json(products);
  } catch (error) {
    res.status(500).json({ message: 'Error fetching products', error });
  }
};

// const getAllProducts = async (req, res) => {
//   try {
//     const products = await Product.find();
//     res.status(200).json(products);
//   } catch (error) {
//     res.status(500).json({ message: 'Error fetching products', error });
//   }
// };

// const getAllProducts = async (req, res) => {
//   try {
//     // await new Promise((resolve) => setTimeout(resolve, 6000)); // Giả lập độ trễ 6 giây
//     const products = await Product.find();
//     res.status(200).json(products);
//   } catch (error) {
//     res.status(500).json({ message: 'Error fetching products', error });
//   }
// };
// module.exports = { createProduct };
module.exports = { createProduct, getAllProducts };
