-- NOT NULL : NULL 허용 안함
CREATE TABLE MyTable17 (
	Col1 INT,
    Col2 INT NOT NULL
);
INSERT INTO MyTable17 (Col1, Col2)
VALUES (100, 200); -- ok
INSERT INTO MyTable17 (Col2)
VALUES (200); -- ok
INSERT INTO MyTable17 (Col1)
VALUES (100); -- fail

SELECT * FROM MyTable17;
DESC MyTable17;

CREATE TABLE MyTable18 (
	Col1 VARCHAR(25),
    Col2 VARCHAR(25) NOT NULL
);
INSERT INTO MyTable18
VALUES('가나다','라마바사');
INSERT INTO MyTable18 (Col2)
VALUES('라마바사');
INSERT INTO MyTable18 (Col1)
VALUES('가나다');

SELECT * FROM MyTable18;
DESC MyTable18;

CREATE TABLE MyTable19 (
	Col1 INT DEFAULT 0,
    Col2 INT NOT NULL
);
DESC MyTable19;
INSERT INTO MyTable19
VALUES (100, 200); -- ok
INSERT INTO MyTable19 (Col2)
VALUES (200); -- ok Col1에는 0
INSERT INTO MyTable19 (Col1)
VALUES (100); -- fail
INSERT INTO MyTable19
VALUES (NULL, 200);

SELECT * FROM MyTable19;

-- not null default 조합 가능
CREATE TABLE MyTable20 (
	Col1 INT, -- null 허용, default 없음
    Col2 INT NOT NULL, -- null 허용안함, default 없음
    Col3 INT DEFAULT 0, -- null 허용, default 0
    Col4 INT NOT NULL DEFAULT 0 -- null 허용안함, default 0
);
DESC MyTable20;