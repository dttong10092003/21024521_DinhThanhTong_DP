const express = require('express');
const router = express.Router();
const { createShipment, updateShippingStatus } = require('../controllers/shippingController');

router.post('/', createShipment);
router.patch('/:id/status', updateShippingStatus);

module.exports = router;
