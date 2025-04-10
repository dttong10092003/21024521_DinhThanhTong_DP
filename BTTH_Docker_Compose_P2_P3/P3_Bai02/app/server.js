const express = require('express');
const mongoose = require('mongoose');

const app = express();
app.use(express.json());

mongoose.connect('mongodb://mongo:27017/mydb', {
  useNewUrlParser: true,
  useUnifiedTopology: true
}).then(() => console.log("✅ Đã kết nối MongoDB"))
  .catch(err => console.error("❌ MongoDB lỗi:", err));

const Item = mongoose.model('Item', { name: String });

app.get('/items', async (req, res) => {
  const items = await Item.find();
  res.json(items);
});

app.post('/items', async (req, res) => {
  const newItem = new Item({ name: req.body.name });
  await newItem.save();
  res.json(newItem);
});

app.listen(3000, () => console.log('🚀 Node.js server đang chạy ở port 3000'));
