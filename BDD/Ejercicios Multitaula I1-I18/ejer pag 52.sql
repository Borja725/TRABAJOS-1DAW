--1
SELECT 
    p.equipc AS codigo_equipo_local,
    c1.nom AS ciudad_equipo_local,
    p.equipf AS codigo_equipo_visitante,
    c2.nom AS ciudad_equipo_visitante
FROM 
    partits p
JOIN 
    equips e1 ON p.equipc = e1.codi
JOIN 
    ciutats c1 ON e1.ciutat = c1.codi
JOIN 
    equips e2 ON p.equipf = e2.codi
JOIN 
    ciutats c2 ON e2.ciutat = c2.codi;

--2

SELECT 
    j.data AS fecha_partido,
    eq1.nomcurt AS nombre_equipo_local,
    ciu1.nom AS ciudad_equipo_local,
    eq2.nomcurt AS nombre_equipo_visitante,
    ciu2.nom AS ciudad_equipo_visitante,
    (ciu1.habitants + ciu2.habitants) AS total_habitantes
FROM 
    partits p
JOIN 
    jornades j ON p.jornada = j.num
JOIN 
    equips eq1 ON p.equipc = eq1.codi
JOIN 
    equips eq2 ON p.equipf = eq2.codi
JOIN 
    ciutats ciu1 ON eq1.ciutat = ciu1.codi
JOIN 
    ciutats ciu2 ON eq2.ciutat = ciu2.codi
WHERE 
    p.golsc IS NULL AND p.golsf IS NULL;

--3    

SELECT 
    e.nomcurt AS nombre_equipo,
    e.pressupost AS presupuesto_total,
    SUM(j.sou) AS gasto_jugadores,
    (SUM(j.sou) / e.pressupost) * 100 AS porcentaje_gasto
FROM 
    equips e
LEFT JOIN 
    jugadors j ON e.codi = j.equip
GROUP BY 
    e.codi;

--4    

SELECT 
    jugadors.nom AS nombre_jugador,
    ciutats.nom AS ciudad_juego
FROM 
    jugadors
JOIN 
    equips ON jugadors.equip = equips.codi
JOIN 
    ciutats ON equips.ciutat = ciutats.codi;


--5

SELECT 
    SUM(gols) AS total_goles_penal
FROM 
    golejadors gj
JOIN 
    equips e ON gj.equip = e.codi
JOIN 
    ciutats c ON e.ciutat = c.codi
WHERE 
    c.habitants < 200000
    AND gj.penals IS NOT NULL;

--6

SELECT 
    j.data AS fecha_partido,
    CASE
        WHEN p.equipc = 'val' THEN 'Valencia'
        WHEN p.equipf = 'val' THEN 'Valencia'
        WHEN p.equipc = 'bar' THEN 'Barcelona'
        WHEN p.equipf = 'bar' THEN 'Barcelona'
    END AS equipo_local,
    CASE
        WHEN p.equipc = 'val' THEN 'Barcelona'
        WHEN p.equipf = 'val' THEN 'Valencia'
        WHEN p.equipc = 'bar' THEN 'Valencia'
        WHEN p.equipf = 'bar' THEN 'Barcelona'
    END AS equipo_visitante,
    p.golsc AS goles_equipo_local,
    p.golsf AS goles_equipo_visitante
FROM 
    partits p
JOIN 
    jornades j ON p.jornada = j.num
WHERE 
    (p.equipc = 'val' OR p.equipf = 'val') AND (p.equipc = 'bar' OR p.equipf = 'bar');

--7

SELECT 
    j.data AS fecha_partido,
    e1.nomllarg AS equipo_local,
    e2.nomllarg AS equipo_visitante,
    p.golsc AS goles_equipo_local,
    p.golsf AS goles_equipo_visitante
FROM 
    partits p
JOIN 
    jornades j ON p.jornada = j.num
JOIN 
    equips e1 ON p.equipc = e1.codi
JOIN 
    equips e2 ON p.equipf = e2.codi
WHERE 
    (e1.nomcurt = 'València' OR e2.nomcurt = 'València') AND (e1.nomcurt = 'Barça' OR e2.nomcurt = 'Barça');

--8

SELECT 
    j1.nom AS jugador1,
    j1.sou AS salario_jugador1,
    j2.nom AS jugador2,
    j2.sou AS salario_jugador2
FROM 
    jugadors j1
JOIN 
    jugadors j2 ON j1.sou > 10 * j2.sou OR j2.sou > 10 * j1.sou
WHERE 
    j1.nom < j2.nom;


