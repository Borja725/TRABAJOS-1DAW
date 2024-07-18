SELECT * FROM golejadors WHERE penals > 0;

-- 2.
SELECT jornada, equip_casa, golsc, equipf, golsf, (golsc + golsf) AS total_gols,
       possessioc, possessiof
FROM partits
ORDER BY total_gols DESC, golsc DESC;

-- 3.
SELECT SUM(golsc + golsf) FROM partits;

-- 4.
SELECT AVG(golsc + golsf) FROM partits;

-- 5.
SELECT COUNT(*) FROM partits WHERE equip_casa = 'bar' AND golsc > golsf OR equipf = 'bar' AND golsf > golsc;

-- 6.
SELECT COUNT(*) FROM partits WHERE equip_casa = 'val' AND (golsc IS NULL OR golsf IS NULL) OR equipf = 'val' AND (golsc IS NULL OR golsf IS NULL);

-- 7.
SELECT MAX(sou), MIN(sou), AVG(sou) FROM jugadors;

-- 8.
UPDATE equips SET pressupost = pressupost * 1.05;

-- 9.
SELECT equipc, equipf,
       CASE WHEN golsc > golsf THEN '1'
            WHEN golsc < golsf THEN '2'
            ELSE 'X' END AS resultat
FROM partits
WHERE jornada = 1;

-- 10.
SELECT SUM(gols) FROM jugadors WHERE pitxitxi = 1;

-- 11.
SELECT jornada, equipc, equipf,
       CASE WHEN golsc > golsf THEN '1'
            WHEN golsc < golsf THEN '2'
            ELSE 'X' END AS resultat
FROM partits
ORDER BY jornada;
