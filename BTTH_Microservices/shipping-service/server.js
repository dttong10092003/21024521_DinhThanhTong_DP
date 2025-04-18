const express = require('express');
const mongoose = require('mongoose');
const cors = require('cors');
require('dotenv').config();

const app = express();
app.use(cors());
app.use(express.json());

mongoose.connect(process.env.MONGODB_URI)
  .then(() => console.log('Connected to MongoDB for Shipping Service'));

const shippingRoutes = require('./routes/shippingRoutes');
app.use('/shipping', shippingRoutes);

app.listen(process.env.PORT || 4003, () => {
  console.log(`Shipping Service running on port ${process.env.PORT}`);
});
