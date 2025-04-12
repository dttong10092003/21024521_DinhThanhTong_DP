const express = require('express');
const router = express.Router();
const customerService = require('../services/customerService');

router.post('/', customerService.createCustomer);
router.get('/', customerService.getAllCustomers);

module.exports = router;
