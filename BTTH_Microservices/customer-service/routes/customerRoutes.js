const express = require('express');
const { createCustomer, getAllCustomers } = require('../controllers/customerController');

const router = express.Router();

router.post('/', createCustomer);
router.get('/', getAllCustomers);

module.exports = router;
