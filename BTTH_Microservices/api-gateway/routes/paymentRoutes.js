const express = require('express');
const router = express.Router();
const paymentService = require('../services/paymentService');

router.post('/', async (req, res) => {
  const result = await paymentService.createPayment(req.body);
  if (result.error) {
    return res.status(503).json({ message: 'Payment Service lỗi', error: result.error });
  }
  res.json(result.data);
});

module.exports = router;
