CREATE DATABASE leetcode175;
use leetcode175;

CREATE TABLE Person (
	personId INT PRIMARY KEY,
    lastName VARCHAR(200),
    firstName VARCHAR(200)
);
INSERT INTO Person VALUES (1, 'Wang', 'Allen');
INSERT INTO Person VALUES (2, 'Alice', 'Bob');

SELECT * FROM Person;
SELECT * FROM Address;

CREATE TABLE Address (
	addressId INT PRIMARY KEY,
    personId INT,
    city VARCHAR(200),
    state VARCHAR(200)
);

INSERT INTO Address VALUES (1, 2, 'New York City', 'New York');
INSERT INTO Address VALUES (2, 3, 'Leetcode', 'California');

SELECT p.firstName, p.lastName, a.city, a.state
FROM Person p LEFT JOIN Address a
ON p.personId = a.personId;

SELECT * FROM Person;
SELECT * FROM Address;
SELECT firstName, 
		lastName,
        (SELECT city 
        FROM Address WHERE personId = p.personid) city,
        (SELECT state 
        FROM Address WHERE personId = p.personid) state
FROM Person p;
