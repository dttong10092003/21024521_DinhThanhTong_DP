const Shipping = require('../models/shipping');

exports.createShipment = async (req, res) => {
  try {
    const { orderId, address } = req.body;
    const shipment = await Shipping.create({ orderId, address });
    res.status(201).json(shipment);
  } catch (err) {
    res.status(500).json({ message: err.message });
  }
};

exports.updateShippingStatus = async (req, res) => {
  try {
    const { id } = req.params;
    const { status } = req.body;
    const updated = await Shipping.findByIdAndUpdate(id, { status }, { new: true });
    res.json(updated);
  } catch (err) {
    res.status(500).json({ message: err.message });
  }
};
