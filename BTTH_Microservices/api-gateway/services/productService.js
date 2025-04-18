const { callService } = require('../resilientClient');
const PRODUCT_SERVICE_URL = process.env.PRODUCT_SERVICE_URL;

exports.createProduct = async (req, res) => {
  const result = await callService(`${PRODUCT_SERVICE_URL}/products`, {
    method: 'POST',
    data: req.body,
  });

  if (result.error) {
    return res.status(503).json({ message: 'Product service lỗi', error: result.error });
  }

  res.json(result.data);
};

exports.getAllProducts = async (req, res) => {
  const result = await callService(`${PRODUCT_SERVICE_URL}/products`);

  if (result.error) {
    return res.status(503).json({ message: 'Product service lỗi', error: result.error });
  }

  res.json(result.data);
};