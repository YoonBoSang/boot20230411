USE w3schools;

SELECT lastName, firstName FROM Employees;

SELECT lastName, firstName FROM (SELECT lastName, firstName FROM Employees) emp
WHERE lastName >= 'd' AND lastName < 'e';

-- 고객별 소비금액
SELECT AVG(구매금액) FROM
(SELECT c.CustomerID, c.CustomerName, SUM(p.Price * d.Quantity) 구매금액
FROM 
	Orders o JOIN OrderDetails d ON o.OrderID = d.OrderID
			 JOIN Customers c ON o.CustomerID = c.CustomerID
             JOIN Products p ON d.ProductID = p.ProductID
GROUP BY c.CustomerID
ORDER BY 구매금액 DESC) t1;

-- 직원별 처리금액 평균
SELECT AVG(매출) FROM 
(SELECT SUM(p.Price * d.Quantity) 매출, e.EmployeeID 번호, CONCAT(e.FirstName, ' ', e.LastName) 이름
FROM Orders o JOIN OrderDetails d ON o.OrderID = d.OrderID
			  JOIN Products p ON d.ProductID = p.ProductID
              JOIN Employees e ON o.EmployeeID = e.EmployeeID
GROUP BY e.EmployeeID
ORDER BY 매출 DESC) t1;

SELECT * FROM Categories;
SELECT * FROM Products;
SELECT p FROM
(SELECT AVG(Price) p FROM Products 
GROUP BY CategoryId) t1
WHERE p >= 30.00;

SELECT AVG(Price) FROM Products
GROUP BY CategoryID
HAVING AVG(Price) >= 30.00;

SELECT T1.CategoryID, c.CategoryName, T1.average
FROM
(SELECT CategoryID, AVG(Price) average
FROM Products
GROUP BY CategoryID) T1 JOIN Categories c ON T1.CategoryId = c.CategoryId
WHERE average >= 30.00;
