-- Write your PostgreSQL query statement below
SELECT E1.name FROM Employee AS E1 INNER JOIN Employee as E2 on E1.id=E2.managerId GROUP BY E1.name , E1.id HAVING COUNT(E1.id)>4;