--9

SELECT 
    j1.nom AS jugador1,
    e1.nomllarg AS equipo_jugador1,
    j1.sou AS salario_jugador1,
    j2.nom AS jugador2,
    e2.nomllarg AS equipo_jugador2,
    j2.sou AS salario_jugador2
FROM 
    jugadors j1
JOIN 
    jugadors j2 ON j1.sou > 10 * j2.sou OR j2.sou > 10 * j1.sou
JOIN
    equips e1 ON j1.equip = e1.codi
JOIN
    equips e2 ON j2.equip = e2.codi
WHERE 
    j1.nom < j2.nom;


--10

SELECT 
    mc.nom AS nom_migcampista,
    mc.sou AS sou_migcampista,
    d.nom AS nom_delantero,
    d.sou AS sou_delantero,
    e.nomllarg AS nom_equip
FROM 
    jugadors mc
JOIN 
    jugadors d ON mc.equip = d.equip
JOIN 
    equips e ON mc.equip = e.codi
WHERE 
    mc.lloc = 'migcampista'
    AND d.lloc = 'davanter'
    AND mc.sou > d.sou;

--11

SELECT 
    e.nomllarg AS equipo,
    p.nom AS nom_portero,
    p.gols AS goles_encajados,
    g.nom AS nom_goleador,
    g.gols AS goles_marcados
FROM 
    porters po
JOIN 
    golejadors g ON po.equip = g.equip AND po.dorsal = g.dorsal
JOIN 
    jugadors p ON po.equip = p.equip AND po.dorsal = p.dorsal
JOIN 
    equips e ON po.equip = e.codi
WHERE 
    g.gols > po.gols;


--12

SELECT 
    j.nom AS nombre_jugador,
    gj.*
FROM 
    jugadors j
JOIN 
    golejadors gj ON j.equip = gj.equip AND j.dorsal = gj.dorsal
WHERE 
    j.nom LIKE '%Messi%' OR j.nom LIKE '%Ronaldo%';


--13

SELECT 
    j.data AS fecha_jornada,
    ROUND(AVG(g.gols), 1) AS media_goles
FROM 
    jornades j
JOIN 
    partits p ON j.num = p.jornada
JOIN 
    golejadors g ON p.equipc = g.equip AND p.equipf = g.equip AND g.dorsal = 9
GROUP BY 
    j.data;


--14

SELECT 
    e.nomllarg AS equipo,
    COUNT(CASE WHEN p.golsc > p.golsf THEN 1 END) AS partidos_ganados,
    COUNT(CASE WHEN p.golsc = p.golsf THEN 1 END) AS partidos_empatados,
    COUNT(CASE WHEN p.golsc < p.golsf THEN 1 END) AS partidos_perdidos
FROM 
    partits p
JOIN 
    equips e ON p.equipc = e.codi OR p.equipf = e.codi
GROUP BY 
    e.nomllarg;


--15

SELECT 
    e.nomllarg AS equipo,
    (38 - COUNT(p.jornada)) AS partidos_restantes
FROM 
    equips e
LEFT JOIN 
    partits p ON e.codi = p.equipc OR e.codi = p.equipf
GROUP BY 
    e.nomllarg;
