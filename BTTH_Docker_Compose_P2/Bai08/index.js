const mysql = require('mysql2');

// Tạo kết nối MySQL
const connection = mysql.createConnection({
  host: 'mysql',   // Dùng tên dịch vụ MySQL trong Docker Compose
  user: 'root',
  password: 'password',
  database: 'testdb'
});

// Kết nối tới MySQL
connection.connect((err) => {
  if (err) {
    console.error('Lỗi kết nối: ' + err.stack);
    return;
  }
  console.log('Đã kết nối đến MySQL với ID ' + connection.threadId);
});

// Test truy vấn
connection.query('SELECT NOW()', (err, results) => {
  if (err) {
    console.error('Lỗi truy vấn: ' + err.stack);
  } else {
    console.log('Kết quả truy vấn:', results);
  }
  connection.end();
});
