const express = require('express');
const router = express.Router();
const { createPayment, updateStatus } = require('../controllers/paymentController');

router.post('/', createPayment);
router.patch('/:id/status', updateStatus);

module.exports = router;
