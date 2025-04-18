const mongoose = require('mongoose');

const paymentSchema = new mongoose.Schema({
  orderId: String,
  amount: Number,
  status: {
    type: String,
    enum: ['pending', 'paid', 'refunded'],
    default: 'pending'
  }
}, { timestamps: true });

module.exports = mongoose.model('Payment', paymentSchema);
