SELECT * FROM customers ORDER BY name;

SELECT *
FROM customers
WHERE credit_limit BETWEEN (SELECT AVG(credit_limit) FROM customers) - 2000 AND (SELECT AVG(credit_limit) FROM customers) + 2000;

SELECT AVG(credit_limit) FROM customers;