const express = require('express');
const router = express.Router();
const shippingService = require('../services/shippingService');

router.post('/', async (req, res) => {
  const result = await shippingService.createShipping(req.body);
  if (result.error) {
    return res.status(503).json({ message: 'Shipping Service lỗi', error: result.error });
  }
  res.json(result.data);
});

module.exports = router;
