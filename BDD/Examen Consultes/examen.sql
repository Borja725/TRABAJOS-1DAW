-- Active: 1704873046558@@192.168.56.101@3306@lliga1213
use lliga1213;

--1

select equip, dorsal, partits, gols as goles_por_partido
from porters
WHERE (partits is not null and gols is not null)
order by goles_por_partido DESC;

--2

--3

SELECT equipc, equipf
from partits
WHERE possessioc > 70;

--4

select nom, dorsal, equip
from jugadors
WHERE (lloc = 'defensa' or lloc = 'porter' and sou > 1000000);

--5

select nomllarg
from equips
WHERE patrocinador = ' ';

--6

select codi, nomcurt, ciutat, pressupost
from equips
ORDER BY pressupost DESC;

--7

select jornada
from partits
WHERE golsc is null and golsf is null
GROUP BY jornada;

--8

SELECT sum(gols) as total_gols, avg(gols) as media_goles
from porters
WHERE equip = 'val';

--9

select sum(golsc) as total_goles
from partits
WHERE golsc > golsf;

-- Jo entenc com a suma total dels gols de casa. 

--10
select AVG(sou) as media_equipos
from jugadors
WHERE equip = 'rma'
UNION
select AVG(sou)
from jugadors
WHERE equip = 'bar'
UNION
select AVG(sou)
from jugadors
WHERE equip = 'val'
UNION
select AVG(sou)
from jugadors
WHERE equip = 'ath'

--11

SELECT if (golsc > golsf, 1, NULL) as guanyats,
IF (golsc = golsf, 'X', NULL) as empatats,
IF (golsc < golsf, '2', NULL) as perduts
from partits
WHERE equipc = 'bet'


--12

--13

select sum(golsc+golsf) as total_gols, COUNT(*) as partits_juats
from partits
WHERE golsc is not NULL or golsf is not NULL
GROUP BY jornada

--14

select sum(gols) as gols_equip, sum(penals) as gols_penal
FROM golejadors
GROUP BY equip
ORDER BY gols_equip,gols_penal ASC;

--15

SELECT equip,COUNT(*) as numero_de_jugadors_por_equipo
from jugadors
WHERE lloc is NOT NULL
GROUP BY equip;

--16

SELECT equipf,count(*) as num_part_guanyats_equip_visitant_per_equip
from partits
WHERE golsf > golsc
GROUP BY equipf;

--17

SELECT equip, sum(penals) as gols_penals
from golejadors
GROUP BY equip
ORDER BY gols_penals DESC;

--18

SELECT count(*) as partidos_ganados_por_jornada, sum(golsc) as goles_equipc
from partits
WHERE golsc > golsf
GROUP BY jornada;

--19

SELECT codi as codigo_ciudad, count(codi) as numero_equipos
from ciutats
GROUP BY codi;

--20

select equip, gols
FROM porters
GROUP BY equip
ORDER BY gols DESC;



