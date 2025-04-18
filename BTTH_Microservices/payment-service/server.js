const express = require('express');
const mongoose = require('mongoose');
const cors = require('cors');
require('dotenv').config();

const app = express();
app.use(cors());
app.use(express.json());

mongoose.connect(process.env.MONGODB_URI)
  .then(() => console.log('Connected to MongoDB for Payment Service'));

const paymentRoutes = require('./routes/paymentRoutes');
app.use('/payments', paymentRoutes);

app.listen(process.env.PORT || 4001, () => {
  console.log(`Payment Service running on port ${process.env.PORT}`);
});
