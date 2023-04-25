SELECT Country FROM Suppliers;
SELECT DISTINCT Country FROM Suppliers;
SELECT * FROM Customers
WHERE Country IN (SELECT DISTINCT Country FROM Suppliers);

-- '1996-07-04'에 주문한 상품명 조회
SELECT * FROM Orders;
SELECT * FROM OrderDetails;
SELECT * FROM Products;
SELECT p.ProductName FROM Products p
WHERE p.ProductID IN (SELECT od.ProductID FROM OrderDetails od
					WHERE od.OrderId IN (SELECT o.OrderId FROM Orders o
										WHERE o.OrderDate = '1996-07-04'));