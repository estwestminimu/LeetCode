SELECT P.project_id, ROUND(
    AVG(e.experience_years),
    2)
     as average_years FROM Project as P INNER JOIN Employee as E on P.employee_id=E.employee_id
GROUP BY P.project_id