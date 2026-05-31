-- Write your PostgreSQL query statement below
SELECT P.firstName as "firstName", P.lastName as "lastName", A.city, A.state FROM   Person as P LEFT JOIN Address as A on P.personId=A.personId