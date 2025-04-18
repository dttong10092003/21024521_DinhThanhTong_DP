const Payment = require('../models/payment');

exports.createPayment = async (req, res) => {
  try {
    const { orderId, amount } = req.body;
    const payment = await Payment.create({ orderId, amount });
    res.status(201).json(payment);
  } catch (err) {
    res.status(500).json({ message: err.message });
  }
};

exports.updateStatus = async (req, res) => {
  try {
    const { id } = req.params;
    const { status } = req.body;
    const updated = await Payment.findByIdAndUpdate(id, { status }, { new: true });
    res.json(updated);
  } catch (err) {
    res.status(500).json({ message: err.message });
  }
};
