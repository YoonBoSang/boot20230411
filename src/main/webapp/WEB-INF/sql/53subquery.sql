-- 서브쿼리 (쿼리 안의 쿼리)
-- 책 430 쪽
-- 1) SELECT 문이다.
-- 2) 괄호 안에 있다.
-- 3) 세미콜론이 없다. 

-- 작성 가능 한 위치
-- WHERE, SELECT, FROM, HAVING

USE w3schools;
SELECT categoryID FROM Products
WHERE ProductID = 1;
SELECT categoryName FROM Categories
Where CategoryID = 1;
SELECT categoryName FROM Categories
WHERE CategoryID = (SELECT CategoryID FROM Products
					WHERE ProductID = 1);
                    
SELECT Country FROM Suppliers
WHERE SupplierID = 2; -- USA
SELECT CustomerName FROM Customers
WHERE Country = 'USA';
SELECT CustomerName FROM Customers
WHERE Country = (SELECT Country FROM Suppliers
				WHERE SupplierID = 2);

-- 문제 ) 평균가격보다 높은 가격의 상품들 조회
SELECT * FROM Products;
SELECT * FROM Products
WHERE Price > (SELECT AVG (Price) FROM Products);