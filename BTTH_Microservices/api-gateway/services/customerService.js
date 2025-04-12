const axios = require('axios');
const CUSTOMER_SERVICE_URL = process.env.CUSTOMER_SERVICE_URL;

const createCustomer = async (req, res) => {
  try {
    const response = await axios.post(`${CUSTOMER_SERVICE_URL}/customers`, req.body);
    res.status(response.status).json(response.data);
  } catch (error) {
    res.status(error.response?.status || 500).json({ error: error.message });
  }
};

const getAllCustomers = async (req, res) => {
  try {
    const response = await axios.get(`${CUSTOMER_SERVICE_URL}/customers`);
    res.status(response.status).json(response.data);
  } catch (error) {
    res.status(error.response?.status || 500).json({ error: error.message });
  }
};

module.exports = { createCustomer, getAllCustomers };
