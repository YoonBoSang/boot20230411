-- PRIMARY KEY : NOT NULL + UNIQUE
CREATE TABLE MyTable24 (
	Col1 INT PRIMARY KEY -- NOT NULL + UNIQUE
);
DESC MyTable24;
DESC MyTable23;

CREATE TABLE MyTable25 (
	Col1 INT,
    PRIMARY KEY (Col1)
);
DESC MyTable25;

CREATE TABLE MyTable26 (
	col1 INT,
    col2 INT,
    PRIMARY KEY (col1, col2)
);
DESC MyTable26;
INSERT INTO MyTable26 (col1, col2)
VALUES (1, 1); -- ok
INSERT INTO MyTable26 (col1, col2)
VALUES (2, 2); -- ok
INSERT INTO MyTable26 (col1, col2)
VALUES (1, 2); -- ok
INSERT INTO MyTable26 (col1, col2)
VALUES (5, 5); -- ok
INSERT INTO MyTable26 (col1, col2)
VALUES (3, 3); -- ok
INSERT INTO MyTable26 (col1, col2)
VALUES (1, 5); -- ok
INSERT INTO MyTable26 (col1, col2)
VALUES (5, 1); -- ok
SELECT * FROM MyTable26;

CREATE TABLE MyTable27 (
	Col1 INT,
    Col2 INT,
    PRIMARY KEY (Col1),
    PRIMARY KEY (Col2)
); -- fail
CREATE TABLE MyTable27 (
	Col1 INT PRIMARY KEY,
    Col2 INT PRIMARY KEY
); -- fail

-- 제약사항 (CONSTRAINTS)
-- DEFAULT, UNIQUE, NOT NULL, PRIARY KEY