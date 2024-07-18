-- Active: 1710314804293@@monorail.proxy.rlwy.net@54674
--7


select j.data, p.equipc, p1.equipf, p.golsc, p.golsf
FROM jornades j, partits p, partits p1, equips e
WHERE e.nomcurt in ('València', 'Barça'), j.data = p.jornada AND p.equipc = e.codi
    AND p1.equipf = e.codi;

--8

select j.nom, j.sou, j1.nom, j1.sou
FROM jugadors j, jugadors j1
WHERE j.sou > 10 * j1.sou or j1.sou > 10 * j.sou;

--9


