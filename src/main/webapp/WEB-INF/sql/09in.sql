SELECT *
FROM Customers
WHERE Country = 'Germany' OR Country = 'France';

SELECT *
FROM Customers
WHERE Country IN ('Germany', 'France');

SELECT *
FROM Products
WHERE CategoryID IN (3, 5);

SELECT *
FROM Products
WHERE CategoryID = 3 OR CategoryID = 5;

SELECT * FROM Products WHERE CategoryID IN (1,3,5,7);

SELECT * FROM Customers WHERE City IN ('Berlin', 'London', 'Madrid', 'Paris');

SELECT * FROM Customers WHERE NOT City IN ('Berlin', 'London', 'Madrid', 'Paris');
SELECT * FROM Customers WHERE City NOT IN ('Berlin', 'London', 'Madrid', 'Paris');

SELECT * FROM Products WHERE CategoryID NOT IN (1, 3, 5, 7);