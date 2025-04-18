const express = require('express');
const router = express.Router();
const { updateStock, getStock } = require('../controllers/inventoryController');

router.post('/', updateStock);
router.get('/:productId', getStock);

module.exports = router;
