const { callService } = require('../resilientClient');
const PAYMENT_SERVICE_URL = process.env.PAYMENT_SERVICE_URL;

exports.createPayment = async (data) => {
  return await callService(`${PAYMENT_SERVICE_URL}/payments`, {
    method: 'POST',
    data,
  });
};
