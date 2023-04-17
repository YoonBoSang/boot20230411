-- +, -, *, /, %

SELECT * FROM Products;
SELECT ProductName, Price * 1300 wonPrice FROM Products;

SELECT ProductName, Price / 100 FROM Products;
SELECT ProductName, Price + 100 FROM Products;
SELECT ProductName, Price - 100 FROM Products;
SELECT ProductName, Price % 100 FROM Products;

-- 문자열 여녁ㄹ
SELECT City + Country FROM Customers;
SELECT CONCAT(City, Country) FROM Customers;
SELECT CONCAT(City, ", ", Country) FROM Customers;
SELECT CONCAT(City, " ", Country) FROM Customers;
SELECT CONCAT(City, " ", Country) cityOfCountry FROM Customers;

-- 직원이름 "firstName, LastName" 형식으로 조회
SELECT * FROM Employees;
SELECT CONCAT(firstName, ", ", lastName) FROM Employees; 

SELECT ProductName, Price * 1300 Price FROM Products
HAVING Price > 100000;

-- 부분 문자열 : substring
-- 첫번째파라미터 : 원본문자열
-- 두번째파라미터 : 시작인덱스
-- 세번쨰파라미터 : 길이
SELECT substring('hello world', 3, 3);
