
use lliga1213;

DELIMITER //

CREATE Function gols_casa(eq VARCHAR(3)) RETURNS INTEGER
BEGIN
    declare gols int;
    select sum(golsc) into gols
    from partits
    where (equipc = eq);
    RETURN gols;
END;
//

DELIMITER ;

select gols_casa('val');

DELIMITER //

CREATE Function gols_fora(eq VARCHAR(3)) RETURNS INTEGER
BEGIN
    declare gols int;
    select sum(golsf) into gols
    from partits
    where (equipf = eq);
    RETURN gols;
END;
//

DELIMITER ;

select gols_fora('val');

select codi, gols_casa(codi) + gols_fora(codi) as gols_total
from equips
ORDER BY gols_total DESC;

DELIMITER //

CREATE FUNCTION calculadora(eq VARCHAR(3), tipo int) RETURNS int
BEGIN
    declare ganados int;
    declare empatados int;
    declare perdidos int;
    IF tipo = 2
    THEN
        select count(*) into ganados
        from partits
        where (equipc = eq and golsc > golsf) OR
              (equipf = eq and golsf > golsc);
        RETURN ganados;
    END IF;
    IF tipo = 1
    THEN
        select count(*) into empatados
        from partits
        where (equipc = eq and golsc = golsf) OR
              (equipf = eq and golsf = golsc);
        RETURN empatados;
    END IF;
    IF tipo = 0
    THEN
        select count(*) into perdidos
        from partits
        where (equipc = eq and golsc < golsf) OR
              (equipf = eq and golsf < golsc);
        RETURN perdidos;
    END IF;
END;
//

DELIMITER;

select calculadora('val',2);

select codi, calculadora(codi,0) + calculadora(codi,1) + calculadora(codi,2) as PJ, calculadora(codi,2) as PG, calculadora(codi,1) as PE, calculadora(codi,0) as PP, calculadora(codi,2) * 3 + calculadora(codi,1) as puntos
from equips
ORDER BY puntos DESC;




     