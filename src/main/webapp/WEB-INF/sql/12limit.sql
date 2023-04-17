SELECT * FROM Customers
LIMIT 5;

SELECT * FROM Products
LIMIT 3;

-- 가격이 높은 상품 3개 조회
SELECT * FROM Products
ORDER BY Price DESC
LIMIT 3;

SELECT * FROM Employees
ORDER BY BirthDate
LIMIT 3;

SELECT * FROM Employees LIMIT 3;

-- 브라질 고객중 아무나 3명 조회
SELECT * FROM Customers
WHERE Country = 'Brazil'
LIMIT 3;

-- 3번 카테고리 상품 중 가격이 싼 상품 2개 조회
SELECT * FROM Products
WHERE CategoryID = 3
ORDER BY Price ASC
LIMIT 2;
