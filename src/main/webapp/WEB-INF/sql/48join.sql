SELECT * FROM Orders o JOIN Customers c
ON o.CustomerID = c.CustomerID;
SELECT * FROM Orders o RIGHT JOIN Customers c
ON o.CUstomerID = c.CustomerID;
SELECT * FROM Orders o RIGHT JOIN Customers c
ON o.CUstomerID = c.CustomerID
WHERE o.OrderID IS NULL; -- 주문한적없는 고객
SELECT * FROM Employees;

SELECT e.LastName, e.FirstName FROM Orders o RIGHT JOIN Employees e
ON o.EmployeeID = e.EmployeeID
WHERE o.OrderID IS NULL;

SELECT * FROM Orders;
