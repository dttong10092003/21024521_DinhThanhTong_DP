// api-gateway/services/customerService.js
const { callService } = require('../resilientClient');
const CUSTOMER_SERVICE_URL = process.env.CUSTOMER_SERVICE_URL;

exports.createCustomer = async (req, res) => {
  const result = await callService(`${CUSTOMER_SERVICE_URL}/customers`, {
    method: 'POST',
    data: req.body,
  });

  if (result.error) {
    return res.status(503).json({ message: 'Customer service lỗi', error: result.error });
  }

  res.json(result.data);
};

exports.getAllCustomers = async (req, res) => {
  const result = await callService(`${CUSTOMER_SERVICE_URL}/customers`);

  if (result.error) {
    return res.status(503).json({ message: 'Customer service lỗi', error: result.error });
  }

  res.json(result.data);
};
