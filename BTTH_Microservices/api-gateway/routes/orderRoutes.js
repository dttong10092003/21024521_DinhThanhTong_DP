const express = require('express');
const router = express.Router();
const orderService = require('../services/orderService');

router.post('/', orderService.createOrder);
router.get('/', orderService.getAllOrders);

module.exports = router;
