SELECT * FROM Customers;
SELECT * FROM Customers WHERE Country = 'Germany';
SELECT * FROM Customers WHERE NOT Country = 'Germany';

-- london에 있지 않는 고객들 조회
SELECT *
FROM Customers
WHERE NOT City = 'London';

-- 50년대 생이 아닌 직원들 조회
SELECT * 
FROM Employees
WHERE BirthDate >= '1950-01-01' AND BirthDate <= '1959-12-31';

SELECT * 
FROM Employees
WHERE NOT (BirthDate >= '1950-01-01' AND BirthDate <= '1959-12-31');

SELECT *
FROM Products
WHERE CategoryID = 1 OR CategoryID = 2;

SELECT *
FROM Products
WHERE NOT (CategoryID = 1 OR CategoryID = 2);