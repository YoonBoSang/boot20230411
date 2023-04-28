USE w3schools;
SELECT * FROM Customers
WHERE CustomerName LIKE '%pp%';

USE Board;
SELECT COUNT(*) FROM Board
WHERE
		title LIKE '%%'
	OR  body  LIKE '%%'
    OR  writer LIKE '%%';