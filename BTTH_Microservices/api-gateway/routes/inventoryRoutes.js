const express = require('express');
const router = express.Router();
const inventoryService = require('../services/inventoryService');

router.get('/:productId', async (req, res) => {
  const result = await inventoryService.getInventory(req.params.productId);
  if (result.error) {
    return res.status(503).json({ message: 'Inventory Service lỗi', error: result.error });
  }
  res.json(result.data);
});

module.exports = router;
