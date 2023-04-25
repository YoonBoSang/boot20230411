CREATE TABLE Employee(
	id INT PRIMARY KEY,
    name VARCHAR(200),
    salary INT,
    managerId INT
);
INSERT INTO Employee VALUES (1, 'Joe', 70000, 3);
INSERT INTO Employee VALUES (2, 'Henry', 80000, 4);
INSERT INTO Employee VALUES (3, 'Sam', 60000, NULL);
INSERT INTO Employee VALUES (4, 'Max', 90000, NULL);

SELECT * FROM Employee;

SELECT e.name Employee FROM Employee e
LEFT JOIN Employee em ON e.managerId = em.id
WHERE e.salary > em.salary;

-- 서브 쿼리
SELECT name
FROM Employee e1
WHERE salary > (SELECT salary
				FROM Employee e2
				WHERE e2.id = e1.managerId);
                