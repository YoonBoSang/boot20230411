DESC MyTable13;
-- MODIFY COLUMN : 컬럼 타입 변경
ALTER TABLE MyTable13
MODIFY COLUMN col20 VARCHAR(40);

SELECT * FROM MyTable13;
ALTER TABLE MyTable13
MODIFY COLUMN col13 VARCHAR(3);

-- 연습) 아무 컬럼이나 타입 변경
ALTER TABLE MyTable13
MODIFY COLUMN col8 INT(55);

ALTER TABLE MyTable13
MODIFY COLUMN col8 VARCHAR(9) FIRST;
DESC MyTable13;
ALTER TABLE MyTable13
MODIFY COLUMN col8 VARCHAR(9) AFTER col6;

ALTER TABLE MyTable13
MODIFY COLUMN col4 DECIMAL(10, 2) FIRST;

