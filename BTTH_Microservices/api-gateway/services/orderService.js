// api-gateway/services/orderService.js
const { callService } = require('../resilientClient');
const ORDER_SERVICE_URL = process.env.ORDER_SERVICE_URL;

exports.createOrder = async (req, res) => {
  const result = await callService(`${ORDER_SERVICE_URL}/orders`, {
    method: 'POST',
    data: req.body,
  });

  if (result.error) {
    return res.status(503).json({ message: 'Order service lỗi', error: result.error });
  }

  res.json(result.data);
};

exports.getAllOrders = async (req, res) => {
  const result = await callService(`${ORDER_SERVICE_URL}/orders`);

  if (result.error) {
    return res.status(503).json({ message: 'Order service lỗi', error: result.error });
  }

  res.json(result.data);
};
