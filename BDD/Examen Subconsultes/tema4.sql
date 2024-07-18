-- Active: 1704873046558@@192.168.56.101@3306@ciclisme
use ciclisme;

--1 - not in 

select *
from etapes
where numero not in (select etapa from ports where etapes.numero = ports.etapa);

--1 - exists

select *
from etapes
where not EXISTS (select etapa from ports where etapes.numero = ports.etapa);

--2

select *
from ciclistes 
where edat = (select max(edat) from ciclistes WHERE ciclistes.dorsal in (select etapes.ciclista from etapes)); 

--3
select *
from ciclistes
where (select count(etapes.ciclista) from etapes where ciclistes.dorsal = etapes.ciclista ) >= ALL (select count(etapes.ciclista) from etapes GROUP BY ciclistes.equip);

--4

select *
from etapes e
where e.kms = (SELECT max(kms) from etapes);

select *
from etapes e
where e.kms >= ALL (SELECT kms from etapes);

select *
from etapes e
where EXISTS (select kms from etapes where e.kms = (SELECT max(kms) from etapes));

--5

select *
from equips
where (select count(ciclistes.nom) from ciclistes where ciclistes.equip = equips.nom ) >= ALL (select count(ciclistes.nom) from ciclistes GROUP BY ciclistes.equip);


