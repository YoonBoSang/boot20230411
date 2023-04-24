-- CARTESIAN PRODUCT (곱집합) 카테시안 곱
SELECT COUNT(*) FROM Products; -- 77
SELECT COUNT(*) FROM Categories; -- 8

SELECT COUNT(*) 
FROM Products JOIN Categories; -- 616

SELECT * FROM Products JOIN Categories;

SELECT * FROM Products JOIN Categories 
ON Products.CategoryId = Categories.CategoryId;

-- 조인 후 컬럼 수 : 왼쪽테이블컬럼수 + 오른쪽테이블컬럼수
DESC Products;
DESC Categories;
SELECT * FROM Products JOIN Categories;
SELECT * FROM Products JOIN Categories
ON Products.CategoryID = Categories.CategoryID;

SELECT ProductName, CategoryName
FROM Products JOIN Categories
ON Products.CategoryID = Categories.CategoryId;

--
SELECT * FROM Products;
SELECT * FROM Suppliers;
SELECT ProductName, SupplierName
FROM Products JOIN Suppliers
ON Products.SupplierID = Suppliers.supplierID
ORDER BY 2;

-- ALIAS 사용으로 코드 줄이기
SELECT CustomerName AS Name FROM Customers;

SELECT ProductName, SupplierName
FROM Products AS p JOIN Suppliers AS s
ON p.SupplierID = s.SupplierID;
SELECT ProductName, SupplierName
FROM Products p JOIN Suppliers s
ON p.SupplierID = s.SupplierID;

SELECT p.SupplierID,s.SupplierID FROM Products p JOIN Suppliers s
ON p.SupplierID = s.SupplierID;