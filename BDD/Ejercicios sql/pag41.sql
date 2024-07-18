--1. 
SELECT 
    codi,
    MAX(j.sou),
    MIN(j.sou),
    SUM(j.sou),
    COUNT(j.equip),
    COUNT(j.sou),
    AVG(j.sou),
    AVG(CASE WHEN j.sou IS NOT NULL THEN j.sou ELSE 0 END)
FROM 
    equips
LEFT JOIN 
    jugadors ON codi = equip
GROUP BY 
    codi;

--2. 
SELECT 
    equip,
    lloc,
    COUNT(*) AS Total_Jugadores
FROM 
    jugadors
GROUP BY 
    equip, lloc;

--3. 
SELECT 
    jornada,
    SUM(golsc + golsf)
FROM 
    partits
GROUP BY 
    jornada;

--4. 
SELECT 
    jornada,
    AVG(golsc + golsf)
FROM 
    partits
GROUP BY 
    jornada;
    
--5. 
SELECT 
    equip,
    MAX(gols)
FROM 
    golejadors
GROUP BY 
    g.equip;

--6. 
SELECT 
    p.equipc,
    SUM(p.golsc)
FROM 
    partits 
GROUP BY 
    equipc;

--7. 
SELECT 
    equipf,
    SUM(golsc)
FROM 
    partits
GROUP BY 
    equipf;

--8. 
SELECT 
    equipc,
    COUNT(*)
FROM 
    partits
WHERE 
    golsc > golsf
GROUP BY 
    equipc;

--9. 
SELECT 
    nom,
    COUNT(*)
FROM 
    jugadors
GROUP BY 
    nom
HAVING 
    COUNT(*) > 1;

--10. 
SELECT 
    equipc,
    ROUND(AVG(possessioc), 0)
FROM 
    partits
GROUP BY 
    equipc
ORDER BY 
    Media_Posesión DESC;

--11. 
SELECT 
    jornada,
    SUM(golsc + golsf)
FROM 
    partits
GROUP BY 
    jornada
HAVING 
    Total_Goles > 35;
