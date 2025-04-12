const express = require('express');
const mongoose = require('mongoose');
const dotenv = require('dotenv');
const customerRoutes = require('./routes/customerRoutes');

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
app.use('/customers', customerRoutes);

const PORT = process.env.PORT || 5003;
app.listen(PORT, () => {
  console.log(`Customer Service running on port ${PORT}`);
});
