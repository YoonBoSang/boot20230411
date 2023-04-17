SELECT * FROM Customers;
SELECT * FROM w3schools.Customers;

USE w3schools; -- 사용할 db 선택
USE test;

-- <= : 작거나 같다
-- >= : 크거나 같다
SELECT * FROM Products WHERE price >= 10.00;
SELECT * FROM Products WHERE Price <= 10.00;
SELECT * FROM Employees WHERE BirthDate <= '1958-09-19';
SELECT * FROM Employees WHERE BirthDate >= '1958-09-19';
SELECT * FROM Products;

