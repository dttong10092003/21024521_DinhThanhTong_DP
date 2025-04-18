const { callService } = require('../resilientClient');
const INVENTORY_SERVICE_URL = process.env.INVENTORY_SERVICE_URL;

exports.getInventory = async (productId) => {
  return await callService(`${INVENTORY_SERVICE_URL}/inventory/${productId}`);
};
