const Inventory = require('../models/inventory');

exports.updateStock = async (req, res) => {
  try {
    const { productId, quantity } = req.body;
    let item = await Inventory.findOne({ productId });

    if (!item) {
      item = await Inventory.create({ productId, quantity });
    } else {
      item.quantity += quantity;
      await item.save();
    }

    res.json(item);
  } catch (error) {
    res.status(500).json({ message: error.message });
  }
};

exports.getStock = async (req, res) => {
  try {
    const { productId } = req.params;
    const item = await Inventory.findOne({ productId });
    res.json(item || { message: 'Not found' });
  } catch (error) {
    res.status(500).json({ message: error.message });
  }
};
