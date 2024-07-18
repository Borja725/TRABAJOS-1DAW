-- Active: 1704873046558@@192.168.56.101@3306@lliga1213
--1
select g.dorsal, g.equip, g.gols
from golejadors g
WHERE g.gols = (select max(g1.gols) FROM golejadors g1);

--2
select j.nom
from jugadors j, golejadors g
WHERE j.equip = g.equip and j.dorsal = g.dorsal and gols = (select max(g1.gols) FROM golejadors g1);

--3
select j.nom, j.sou
from jugadors j
where j.sou = (select max(j1.sou) FROM jugadors j1);

--4

select j.nom, j.sou
from jugadors j
where j.sou = (select max(j2.sou) FROM jugadors j2 WHERE j2.equip = j.equip);

--5

select j.equip, j.nom, j.lloc, ROUND(j.sou/1000000, 1)
from jugadors j
WHERE j.sou = (select max(j2.sou) from jugadors j2 where j2.equip = j.equip and j2.lloc = j.lloc)
ORDER BY 1,3;

--6

select *
from partits p
where (p.golsc+p.golsf) = (select max(p1.golsc+p1.golsf) from partits p1);

--7
select p.*
from partits p
where (p.golsc+p.golsf) = (select max(p2.golsc+p2.golsf) from partits p2 WHERE p2.jornada = p.jornada);

--8

select j.nom, j.equip
from jugadors j, partits p
where (j.equip = p.equipc or j.equip = p.equipf) and (p.golsc+p.golsf) = (select max(p2.golsc+p2.golsf) from partits p2) ;

--9

select p.jornada, sum(p.golsc+p.golsf)
from partits p
    GROUP BY jornada
    having sum(p.golsc+p.golsf) > (
        select sum(p2.golsc+p2.golsf) from partits p2 WHERE p2.jornada = p.jornada -1
    );

--10

select e.codi, e.nomllarg, count(j.lloc)
from equips e
    join jugadors j on e.codi = j.equip
GROUP BY e.codi, j.lloc
ORDER BY 1,2,3;

select e.nomllarg
from equips e 






    where 2 < ( select count(*) from jugadors j WHERE j.equip = e.codi and lloc = 'porter'
    ) and
        2 < ( select count(*) from jugadors j WHERE j.equip = e.codi and lloc = 'mig'
    ) and 
        2 < ( select count(*) from jugadors j WHERE j.equip = e.codi and lloc = 'defensa'    
    ) and 
    2 < ( select count(*) from jugadors j WHERE j.equip = e.codi and lloc = 'davanter'
    )


--11

SELECT j.nom
FROM jugadors j
WHERE j.sou = (SELECT max(pressupost) FROM equips);

--12

SELECT j.nom
FROM jugadors j
WHERE j.dorsal > ALL (
    SELECT SUM(g.gols)
    FROM golejadors g
    WHERE g.equip = j.equip
    GROUP BY g.equip
);

--13

SELECT j.nom, j.equip, e.codi
FROM jugadors j
JOIN equips e ON j.equip = e.codi
WHERE (
    SELECT SUM(g.gols)
    FROM golejadors g
    WHERE g.equip = j.equip
) > ANY (SELECT e.pressupost FROM equips e);

--14

SELECT j.nom, j.equip, e.codi, SUM(g.gols) AS gols_golejador, e.pressupost AS gols_equip_superat
FROM jugadors j
JOIN equips e ON j.equip = e.codi
JOIN golejadors g ON j.equip = g.equip AND j.dorsal = g.dorsal
GROUP BY j.equip, j.dorsal
HAVING SUM(g.gols) > ANY (SELECT e.pressupost FROM equips e)
ORDER BY j.equip, j.nom;

--15

SELECT j.nom, j.equip
FROM jugadors j
WHERE (j.equip, j.dorsal) NOT IN (
    SELECT g.equip, g.dorsal
    FROM golejadors g
);

--16

Select e.nomcurt
from equips e
where (select COUNT(*) FROM jugadors j
    WHERE j.equip = e.codi) >= ALL (SELECT COUNT(*)
                                    FROM jugadors GROUP BY equip)

--17

Select e.nomcurt, COUNT(*) as total_jugadors
from equips e, jugadors ju
where ju.equip = e.codi and (select COUNT(*) FROM jugadors j
    WHERE j.equip = e.codi) >= ALL (SELECT COUNT(*)
                                    FROM jugadors GROUP BY equip);

--18


Select e.nomcurt, COUNT(ju.dorsal) as total_jugadors, 'MIN'
from equips e, jugadors ju
where ju.equip = e.codi and (select COUNT(*) FROM jugadors j
    WHERE j.equip = e.codi) <= ALL (SELECT COUNT(*)
                                    FROM jugadors GROUP BY equip)
UNION
Select e.nomcurt, COUNT(ju.dorsal) as total_jugadors, 'MAX'
from equips e, jugadors ju
where ju.equip = e.codi and (select COUNT(*) FROM jugadors j
    WHERE j.equip = e.codi) >= ALL (SELECT COUNT(*)
                                    FROM jugadors GROUP BY equip);







