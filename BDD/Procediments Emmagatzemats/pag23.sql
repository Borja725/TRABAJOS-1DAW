
drop Function `llistaJugadors`;

DELIMITER //

CREATE FUNCTION listaJugadores (
    eq varchar(3),
    pos varchar(20)
) RETURNS varchar(1000)
BEGIN
    DECLARE lista VARCHAR(1000) DEFAULT '';
    declare nombre varchar(100);
    declare fin int default 0;

    Declare c_jugadores CURSOR FOR 
        select nom
            from jugadors
            where equip = eq and lloc = pos;


    DECLARE CONTINUE HANDLER FOR
        NOT FOUND
        set fin = 1;

    open c_jugadores;
    repeat
        fetch c_jugadores into nombre;
        if not fin then
            if (lista != '') THEN
                set lista = concat(lista, ', ');
            end IF;
            set lista = concat(lista, nombre);
        END IF;
    until fin end REPEAT;
    CLOSE c_jugadores;
    RETURN lista;
END
//


DELIMITER ;

select listaJugadores('rma', 'porter');
