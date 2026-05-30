SELECT S.name FROM Score as SC_US INNER JOIN Friend AS F ON F.id=SC_US.id
INNER JOIN Score AS Score_FR ON Score_FR.id=F.fid 
INNER JOIN Student as S ON S.id=SC_US.id
WHERE Score_FR.value>SC_US.value ORDER BY Score_FR.value DESC