-- INSERT : 테이블에 새 레코드 입력
SELECT * FROM Customers;
INSERT INTO Customers
(CustomerID, CustomerName, ContactName,
ADdress, City, PostalCode, Country)
VALUES
(92, '박지성', '두개의심장',
'London', 'Seoul', '1234567', 'Korea');

SELECT * FROM Customers
WHERE CustomerID = 92;

-- 모든 컬럼에 값을 넣을 떄 컬럼명 생략 가능
INSERT INTO Customers
VALUES (93, '차범근', '차붐', '프랑크푸르트', 'Seoul',
'1234123', 'Korea');

-- 특정 컬럼에만 값을 넣을 때 컬럼명 작성해야함
INSERT INTO Customers
(CustomerID, CustomerName, City, Country)
VALUES
(94, '송태섭', 'Tokyo', 'Japan');

SELECT * FROM Customers
WHERE CustomerID = 94;

-- Supplier 테이블에 30번째 공급자 추가(모든 열)
-- Supplier 테이블에 31번째 공급자 추가
-- SupplierID, SupplierName, City, Country
SELECT * FROM Suppliers ORDER BY 1 DESC;

INSERT INTO Suppliers
VALUES(30, '윤모씨', 'Donut', '청라6', 'Inchoen', '5839', 'Korea', '2350827302');

INSERT INTO Suppliers
(SupplierID, SupplierName, City, Country)
VALUES
(31, '장찬준', 'Inchoen', 'Korea');

