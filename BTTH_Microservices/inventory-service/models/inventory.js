const mongoose = require('mongoose');

const inventorySchema = new mongoose.Schema({
  productId: String,
  quantity: Number
});

module.exports = mongoose.model('Inventory', inventorySchema);
