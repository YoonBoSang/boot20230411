SELECT * FROM Customers WHERE CustomerName Like 'a%';
SELECT * FROM Customers WHERE CustomerName Like '%a';
SELECT * FROM Customers WHERE CustomerName LIKE '%seas%';
SELECT * FROM Customers WHERE CustomerName LIKE '_r%';
SELECT * FROM Customers WHERE CustomerName LIKE 'a_%';
SELECT * FROM Customers WHERE CustomerName LIKE 'a__%';
SELECT * FROM Customers WHERE ContactName LIKE 'a%s';

-- 고객명(CustomerName), 계약명(ContactName) 에 'or'이 포함된 고객들 조회
SELECT * FROM Customers WHERE CustomerName LIKE '%or%' OR ContactName LIKE '%or%';