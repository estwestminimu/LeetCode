SELECT E1.employee_id FROM Employees AS E1 LEFT JOIN Employees AS E2 
ON E1.manager_id=E2.employee_id WHERE E1.manager_id is NOT NULL AND E2.name is NULL  AND E1.salary <30000 ORDER BY E1.employee_id