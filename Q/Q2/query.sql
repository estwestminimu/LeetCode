-- Write your PostgreSQL query statement below
SELECT E1.name as "Employee" FROM Employee AS E1 INNER JOIN Employee AS E2 ON E1.managerId=E2.id  and E1.managerId IS NOT NULL WHERE E1.salary>E2.salary 