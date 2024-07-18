--1. Función  que me devuelva el número de partidos jugados por un equipo

drop Function `partidosJugado`;

DELIMITER //

CREATE Function partidoJugado(eq VARCHAR(3)) RETURNS int
BEGIN
    DECLARE d int;
    select count(*) into d
    from partits
    where (equipc = eq and golsc is NOT NULL)
    OR (equipf = eq and golsc is NOT NULL);
    RETURN d;
END;
//

DELIMITER ;

select partidosJugado('val');


--2. Función  que me devuelva el número de partidos ganados por un equipo

drop Function partid;

DELIMITER //

CREATE Function partidoGanado(eq VARCHAR(3)) RETURNS int
BEGIN
    DECLARE d int;
    select count(*) into d
    from partits
    where (equipc = eq and golsc > golsf) OR 
          (equipf = eq and golsf > golsc);
    RETURN d;
END;
//

DELIMITER ;

select partidoGanado('val');

--3. Función  que me devuelva el número de partidos empatados por un equipo.

drop Function partidoEmpatado;

DELIMITER //

CREATE Function partidoEmpatado(eq VARCHAR(3)) RETURNS int
BEGIN
    DECLARE d int;
    select count(*) into d
    from partits
    where (equipc = eq and golsc = golsf)
    OR (equipf = eq and golsf = golsc);
    RETURN d;
END;
//

DELIMITER ;

select partidoEmpatado('val');

--4. A partir de las funciones anteriores obtén la clasificación de la liga.

select codi, nomcurt,
    partidoJugado(codi) jugados,
    partidoGanado(codi) * 3 + partidoEmpatado(codi) puntos
from equips 
order by puntos desc, nomcurt asc;