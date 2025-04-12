const Customer = require('../models/customer');

// Tạo khách hàng mới
const createCustomer = async (req, res) => {
  try {
    const { name, email, address } = req.body;
    const newCustomer = new Customer({ name, email, address });
    await newCustomer.save();
    res.status(201).json(newCustomer);
  } catch (error) {
    res.status(500).json({ message: 'Error creating customer', error });
  }
};

// Lấy tất cả khách hàng
const getAllCustomers = async (req, res) => {
  try {
    const customers = await Customer.find();
    res.status(200).json(customers);
  } catch (error) {
    res.status(500).json({ message: 'Error fetching customers', error });
  }
};

module.exports = { createCustomer, getAllCustomers };
