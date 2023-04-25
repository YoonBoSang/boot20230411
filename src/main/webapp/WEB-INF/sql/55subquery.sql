USE w3schools;
SELECT * FROM Products;
SELECT ProductName, CategoryId FROM Products;
SELECT ProductName, 
	(SELECT CategoryName 
    FROM Categories
    WHERE CategoryId = p.CategoryId) CategoryName
FROM Products p;

-- 상품명, 상품을 공급하는 공급자명
-- 조회쿼리작성 (서브쿼리로)
SELECT * FROM Products;
SELECT ProductName, 
       (SELECT SupplierName
        FROM Suppliers
        WHERE SupplierId = Products.SupplierId) 
	   AS SupplierName
FROM Products;



