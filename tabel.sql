CREATE TABLE customers (
id INT PRIMARY KEY,
name VARCHAR(50),
email VARCHAR(50)
);

INSERT INTO customers (id, name, email)
VALUES (1, 'Muhammad Naufal Rasyid Kustiar', 'rnaufal5620@gmail.com');

SELECT * FROM customers;
