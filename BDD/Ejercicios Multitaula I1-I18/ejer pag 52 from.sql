-- Active: 1704873046558@@192.168.56.101@3306@lliga1213
--7
select j.data, p.equipc, p1.equipf, p.golsc, p.golsf
FROM jornades j, partits p, partits p1, equips e
WHERE e.nomcurt in ('València', 'Barça') AND j.data = p.jornada AND p.equipc = e.codi
    AND p1.equipf = e.codi;

--8

select j.nom, j.sou, j1.nom, j1.sou
FROM jugadors j, jugadors j1
WHERE j.sou > 10 * j1.sou or j1.sou > 10 * j.sou;


--9

select j.nom, j.sou, j1.nom, j1.sou
FROM jugadors j, jugadors j1
WHERE j.sou > 10 * j1.sou or j1.sou > 10 * j.sou
group by j.equip;

--10

select j1.nom, j1.sou, j1.lloc, j2.nom, j2.sou, j2.lloc
from jugadors j1, jugadors j2
where j1.lloc = 'mig' and j1.equip = j2.equip AND j2.lloc = 'davanter' AND j1.sou > j2.sou;