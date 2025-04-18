const mongoose = require('mongoose');

const shippingSchema = new mongoose.Schema({
  orderId: String,
  address: String,
  status: {
    type: String,
    enum: ['pending', 'shipping', 'delivered'],
    default: 'pending'
  }
}, { timestamps: true });

module.exports = mongoose.model('Shipping', shippingSchema);
