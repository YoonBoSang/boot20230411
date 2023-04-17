-- update : 레코드 수정

SELECT * FROM Customers WHERE CustomerID = 1;

UPDATE Customers            -- 테이블명
SET CustomerName = '서태웅' -- 변경할 컬럼과 값
WHERE CustomerID = 1;       -- 변경할 레코드의 조건
SELECT * FROM Customers WHERE CustomerID = 1;

UPDATE Customers
SET 					      -- 변경할 컬럼과 값 (,)
	CustomerName = '정대만',
    City = 'Seoul',
    Country = 'Korea'
WHERE CustomerID = 1;
    

-- 문제1) 1번 공급자의 이름, 도시, 나라 변경

UPDATE Suppliers
SET SupplierName = '송태섭',
    City = 'Busan',
    Country = 'Korea'
WHERE SupplierID = 1;

-- 
SELECT * FROM Suppliers;

SELECT * FROM Suppliers
WHERE Country = 'USA';

UPDATE Suppliers
SET SupplierName = '채치수',
    Country = 'France'
WHERE Country = 'USA';

SELECT * FROM Suppliers WHERE Country = 'France';

SELECT * FROM Suppliers;
UPDATE Suppliers
SET ContactName = '북산',
    City = 'Seoul';




