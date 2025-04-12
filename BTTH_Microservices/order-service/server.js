const express = require('express');
const mongoose = require('mongoose');
const dotenv = require('dotenv');
const orderRoutes = require('./routes/orderRoutes');

dotenv.config();

const app = express();
app.use(express.json());

// Kết nối MongoDB
mongoose.connect(process.env.MONGODB_URI).then(() => {
  console.log('Connected to MongoDB');
}).catch((err) => {
  console.error('MongoDB connection error:', err);
});

// Sử dụng routes
app.use('/orders', orderRoutes);

const PORT = process.env.PORT || 5002;
app.listen(PORT, () => {
  console.log(`Order Service running on port ${PORT}`);
});
