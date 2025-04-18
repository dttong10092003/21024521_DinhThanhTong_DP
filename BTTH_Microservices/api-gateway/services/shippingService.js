const { callService } = require('../resilientClient');
const SHIPPING_SERVICE_URL = process.env.SHIPPING_SERVICE_URL;

exports.createShipping = async (data) => {
  return await callService(`${SHIPPING_SERVICE_URL}/shipping`, {
    method: 'POST',
    data,
  });
};
