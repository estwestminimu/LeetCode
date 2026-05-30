SELECT T.name, T.age, T.country FROM teachers AS T INNER JOIN (SELECT country, MAX(AGE) AS "age" FROM teachers GROUP BY country) AS SUB 
on  T.age =  SUB.age AND  T.country =  SUB.country;
