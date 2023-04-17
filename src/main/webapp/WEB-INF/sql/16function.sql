-- AVG (평균), SUM(합계)
SELECT SUM(Price) FROM Products;
SELECT AVG(Price) FROM Products;

SELECT SUM(Price) FROM Products WHERE CategoryID = 5;
SELECT AVG(Price) FROM Products WHERE CategoryID = 1;
