const express = require('express');
const mongoose = require('mongoose');
const cors = require('cors');
require('dotenv').config();

const app = express();
app.use(cors());
app.use(express.json());

mongoose.connect(process.env.MONGODB_URI)
  .then(() => console.log('Connected to MongoDB for Inventory Service'));

const inventoryRoutes = require('./routes/inventoryRoutes');
app.use('/inventory', inventoryRoutes);

app.listen(process.env.PORT || 4002, () => {
  console.log(`Inventory Service running on port ${process.env.PORT}`);
});
