-- Active: 1704873046558@@192.168.56.101@3306@lliga1213
use lliga1213;

--1

select p.equipc, p.equipf, j.num, e.nomcurt, e1.nomcurt, p.golsc, p.golsf, p.possessioc, 100-p.possessioc as possesiof
from jornades j
    join partits p on j.num = p.jornada
    join equips e on p.equipc = e.codi
    join equips e1 on p.equipf = e1.codi
WHERE j.num = '2'
ORDER BY p.equipc;

--2

select c.nom, count(*) as total_partits
from partits p
     join equips e on p.equipc = e.codi
     join ciutats c on e.ciutat = c.codi
group by c.codi
ORDER BY total_partits DESC;

--3
select j.nom, e.nomllarg, g.gols, j.sou
from golejadors g
    join jugadors j on g.dorsal = j.dorsal and g.equip = j.equip
    join equips e on j.equip = e.codi
WHERE g.gols > 10;

--4

select j.nom, nvl(g.gols,0)
from jugadors j 
    left join golejadors g on g.dorsal = j.dorsal
    and g.equip = j.equip
ORDER BY g.gols DESC;

--5

select j.num, j.`data`, sum(p.golsc) as totalgolsc, sum(p.golsf) as totalgolsf, sum(p.golsc+p.golsf) as totalgols
from jornades j, partits p
where j.num = p.jornada
GROUP BY j.num
ORDER BY totalgols DESC;

--7

select e.nomcurt
from golejadors g
    join jugadors j on g.dorsal = j.dorsal
    join equips e on j.equip = e.codi and g.equip = j.equip and j.lloc = 'defensa';

--8

select DISTINCT e.nomcurt, j.lloc, g.gols
from golejadors g
    join jugadors j on g.equip = j.equip
    join equips e on j.equip = e.codi
ORDER BY e.nomcurt, j.lloc;


--9

select e.nomcurt, count(p.golsc>p.golsf) as total_ganados
from equips e, partits p
WHERE p.golsc > p.golsf and e.codi = p.equipc
ORDER BY e.nomcurt;

--10

select e.nomllarg, e.pressupost - sum(j.sou) as pressupost
from jugadors j,equips e
where j.equip = e.codi
GROUP BY j.nom; 
