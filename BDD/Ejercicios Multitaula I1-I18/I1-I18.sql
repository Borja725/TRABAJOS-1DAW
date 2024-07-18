-- Active: 1704873046558@@192.168.56.101@3306@ciclisme
--1

select c.nom, e.director
FROM ciclistes c, equips e
WHERE c.equip = e.nom
order by c.nom;

--2

select p.nom, e.eixida, e.arribada
from ports p, etapes e
where p.etapa = e.numero;

--3

SELECT e.director, COUNT(*) as NumeroCorredors
from ciclistes c, equips e
where c.equip = e.nom
GROUP BY e.director;

--3 en join

select e.director, count(c.nom)
from equips e
    left join ciclistes c on c.equip = e.nom
group by e.director;

--4

select c.nom, count(*) as etapesguanyades
from ciclistes c, etapes e
WHERE c.dorsal = e.ciclista
group by c.dorsal
HAVING etapesguanyades > 1
order by etapesguanyades DESC, c.nom


--4 en join

SELECT c.nom, COUNT(*) AS etapesguanyades
FROM ciclistes c
JOIN etapes e ON c.dorsal = e.ciclista
GROUP BY c.dorsal
HAVING etapesguanyades > 1
ORDER BY etapesguanyades DESC, c.nom;


--5

select c.nom
from ciclistes c, ports p, etapes e
where c.dorsal = p.ciclista AND p.etapa = e.numero and e.eixida = 'Igualada';

--5.b

select e.numero, e.eixida, e.arribada, count(p.altura) puertos
from etapes e, ports p
GROUP BY e.numero
order by e.numero;

--5.b en join per javi

select e.numero, e.eixida, e.arribada, count(p.altura) puertos
from etapes e
    left join ports p on e.numero = p.etapa
GROUP BY e.numero
order by e.numero;

--7

select e1.numero, e1.kms, e2.numero, e2.kms
from etapes e1, etapes e2
WHERE e1.kms = e2.kms and 
            e1.numero < e2.numero;
--8

SELECT *
from etapes e, ports p
where e.numero = p.etapa AND e.arribada = e.eixida;

--9

select p.nom, c.nom
from ports p, ciclistes c 
WHERE p.etapa = c.dorsal;

--10

select e.numero, c.equip
from etapes e, ciclistes c 
WHERE e.numero = c.dorsal
ORDER BY 1;

--11.b

select e.numero, eq.director
from etapes e 
        JOIN ports p on e.numero = p.etapa
        JOIN portar po on p.etapa = po.etapa
        JOIN ciclistes c on po.ciclista = c.dorsal
        JOIN equips eq on c.equip = eq.nom
ORDER BY 1;


--12









