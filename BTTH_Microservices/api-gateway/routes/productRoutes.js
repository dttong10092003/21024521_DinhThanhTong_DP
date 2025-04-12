const express = require('express');
const router = express.Router();
const productService = require('../services/productService');

router.post('/', productService.createProduct);
router.get('/', productService.getAllProducts);

module.exports = router;
