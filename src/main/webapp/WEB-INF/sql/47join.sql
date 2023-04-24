CREATE TABLE TableA (
	Num1 INT
);
CREATE TABLE TableB (
	Num2 INT 
);
DESC TableA;
DESC TableB;

INSERT INTO TableA (Num1)
VALUES (1);
INSERT INTO TableA (Num1)
VALUES (2);
INSERT INTO TableA (Num1)
VALUES (3);
INSERT INTO TableA (Num1)
VALUES (4);
INSERT INTO TableA (Num1)
VALUES (5);

INSERT INTO TableB (Num2)
VALUES (3), (4), (5), (6), (7);

SELECT * FROM TableA; -- 1, 2, 3, 4, 5
SELECT * FROM TableB; -- 3, 4, 5, 6, 7

SELECT * FROM TableA JOIN TableB; -- cartesian product

SELECT * FROM TableA a JOIN TableB b
ON a.Num1 = b.Num2; -- INNER JOIN
SELECT * FROM TableA a LEFT JOIN TableB b
ON a.NUM1 = b.Num2; -- LEFT (OUTER) JOIN
SELECT * FROM TableA a RIGHT JOIN TableB b
ON a.NUM1 = b.Num2; -- RIGHT (OUTER) JOIN
