-- AND
SELECT * 
FROM Customers 
WHERE CustomerId > 4 AND Country = 'Germany';

SELECT *
FROM Employees
WHERE LastName >= 'o' AND BirthDate >= '1960-01-01';

-- 카테고리 ID가 2이고 가격이 20.00 이상인 상품들 조회
SELECT *
FROM Products
WHERE CategoryID = 2 AND Price > 20.00;

-- 1950-01-01 ~ 1959-12-31 사이에 태어난 직원들 조회
SELECT *
FROM Employees
WHERE BirthDate > '1950-01-01' AND BirthDate < '1959-12-31';


-- OR
SELECT *
FROM Customers
WHERE Country = 'Germany';
SELECT *
FROM Customers
WHERE Country = 'France';
SELECT *
FROM Customers
WHERE Country = 'France' OR Country = 'Germany';

-- 도시가 런던 또는 마드리드 에 있는 고객들 조회
SELECT *
FROM Customers
WHERE City = 'London' OR City = 'Madrid';

SELECT *
FROM Products
WHERE CategoryID = 1 OR CategoryID = 2;



