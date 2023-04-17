-- null : 값이 없음
-- null vs '' : 데이터베이스 마다 다름

-- IS NULL : 값이 null 인가?
SELECT * FROM Suppliers
WHERE ContactName = '';
SELECT * FROM Suppliers
WHERE ContactName IS NULL;

-- 값이 NULL 아닌 컬럼 조회
SELECT * FROM Suppliers
WHERE NOT ContactName IS NULL
ORDER BY 1 DESC;
SELECT * FROM Suppliers
WHERE ContactName IS NOT NULL
ORDER BY 1 DESC;


-- Customers 테이블에서 Address 컬럼이 NULL인 레코드 조회
SELECT * FROM Customers
WHERE Address IS NULL;

SELECT * FROM Customers
WHERE Address IS NOT NULL;

SELECT COUNT(CustomerID) FROM Customers;
SELECT COUNT(Address) FROM Customers;
SELECT COUNT(*) FROM Customers;

SELECT COUNT(SupplierID) FROM Suppliers;
SELECT COUNT(ContactName) FROM Suppliers;

SELECT COUNT(*) FROM Suppliers;

SELECT * FROM Products ORDER BY 1 DESC;
INSERT INTO Products
VALUES(78, 'Cake', 12, 2, '조각', NULL);
INSERT INTO Products
(ProductID, ProductName, SupplierID, CategoryID, Unit)
VALUES(79, 'Pizza', 12, 2, '조각');

SELECT * FROM Products WHERE CategoryID = 2 ORDER BY 1 DESC;
-- 14

SELECT SUM(Price) FROM Products WHERE CategoryID = 2;
-- 276.75
SELECT 276.75 /14; -- 19.767857
SELECT 276.75 /12; -- 23.062500

SELECT AVG(Price) FROM Products WHERE CategoryID = 2;
-- IFNULL : null이면 다른 값으로 변경
SELECT IFNULL(0, 100); -- 0
SELECT IFNULL('kim', 'lee'); -- kim
SELECT IFNULL(NULL, 100); -- 100
SELECT IFNULL(NULL, 'park'); -- park

SELECT ProductID, ProductName, SupplierID, CategoryID
,Unit, Price FROM Products ORDER BY 1 DESC;
SELECT ProductID, ProductName, SupplierID, CategoryID
,Unit, IFNULL(Price, 0) FROM Products ORDER BY 1 DESC;
SELECT ProductID, 
		ProductName,
        SupplierID,
        CategoryID,
        Unit,
        IFNULL(Price, 0)  Price
FROM Products ORDER BY 1 DESC;

SELECT AVG(IFNULL(Price, 0)) AS Average FROM Products WHERE CategoryID = 2;

SELECT AVG(Price) AS Average FROM Products WHERE CategoryID = 2;

SELECT * FROM Customers ORDER BY 1 DESC;

SELECT CustomerID, CustomerName, IFNULL(ContactName, 'Anonymous') ContactName, IFNULL(Address, 'Homeless') Address FROM Customers ORDER BY 1 DESC;

