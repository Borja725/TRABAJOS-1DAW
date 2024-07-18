-- Active: 1704873046558@@192.168.56.101@3306@lliga1213


DELIMITER //

CREATE FUNCTION MaxGolejador (eq varchar(3)) RETURNS int
BEGIN
    DECLARE d int;
    SELECT dorsal into d
    from golejadors
    where equip = eq
    and gols = ( SELECT max(gols)
                from golejadors WHERE equip = eq)
            LIMIT 1;
    return d;            
END;
//
DELIMITER ;

--a
select MaxGolejador('bar');

--b

select codi, MaxGolejador(codi) from equips ;

--c

select equip, dorsal, nom 
from jugadors
where dorsal = MaxGolejador(equip);

--Funcion cuadrado(n) --> calcula n*n

DELIMITER //

CREATE FUNCTION cuadrado (n INT) RETURNS INT
BEGIN
    DECLARE d INT;
    SET d = n * n;
    RETURN d;            
END //

DELIMITER ;



--Funcion potencia(a,b) --> calcula a*b --> si b es 0 devuelve 1

DELIMITER //

CREATE FUNCTION potencia (a INT, b INT) RETURNS INT
BEGIN
    DECLARE d INT DEFAULT 1;
    DECLARE pot int DEFAULT 1;

    IF b = 0 THEN
        SET pot = 1;
    END IF;
    IF a = 0 THEN
        SET pot = 0;
    END IF;
    IF b < 0 THEN
        set pot = -1;
    END IF;

    WHILE ( d < b ) DO
        SET pot = pot * a;
        set d = d + 1;
    END WHILE;

    RETURN pot; 
END //


DELIMITER ;

select potencia(2,10);

--Funcion factorial(n) --> calcula n! si n es o devuelve 1

DELIMITER //

CREATE FUNCTION factorial (n INT) RETURNS INT
BEGIN
    DECLARE result INT DEFAULT 1;
    DECLARE i INT DEFAULT 1;

    if n = 0 THEN
        return 1;
    end IF;

    WHILE i <= n DO
        SET result = result * i;
        SET i = i + 1;
    END WHILE;

    RETURN result;
END //

DELIMITER ;

select factorial(5);

--Funcion diasem(n) --> si n esta entre 0,6 devuelve (lunes...domingo) sino esta entre 0,6 devuelve 'error'
