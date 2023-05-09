USE Board;

DESC Board;

CREATE TABLE FileNames (
	id INT PRIMARY KEY AUTO_INCREMENT,
	boardId INT NOT NULL,
	fileName VARCHAR(300) NOT NULL,
    FOREIGN KEY (boardId) REFERENCES Board(id)
);

SELECT * FROM FileNames WHERE BoardID = 4119;

DESC FileNames;
SELECT * FROM FileNames;
SELECT * FROM Board ORDER BY id DESC;
SELECT * FROM Board b JOIN FileNames f 
ON b.id = f.boardId
WHERE b.id = 4117;
SELECT * FROM Board b LEFT JOIN FileNames f 
ON b.id = f.boardId
WHERE b.id = 4115;

SELECT *,
		COUNT(f.id) fileCount
FROM Board b LEFT JOIN FileNames f
ON b.id = f.boardId
GROUP BY b.id
ORDER BY b.id DESC
LIMIT 0, 5;

SELECT * FROM Board ORDER BY id DESC;
SELECT * FROM FileNames;
DELETE FROM Board WHERE id = 4120;
DELETE FROM FileNames WHERE boardId = 4120;



USE w3schools;

CREATE TABLE Bank (
	name VARCHAR(100),
    money INT
);

INSERT INTO Bank (name, money) VALUES ('A', 100000);
INSERT INTO Bank (name, money) VALUES ('B', 100000);

SELECT * FROM Bank;

SELECT 
	c.CategoryID id,
    c.CategoryName name,
    c.Description,
    p.ProductName,
    p.Price
FROM Categories c JOIN Products p
ON c.CategoryID = p.CategoryID;

SELECT * FROM Suppliers s JOIN Products p
		   ON s.supplierId = p.supplierId
WHERE s.supplierId = 1;

