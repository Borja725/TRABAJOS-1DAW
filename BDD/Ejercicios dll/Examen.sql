--Borja Pellicer 1DAW
--1
DROP DATABASE IF EXISTS libreria;
CREATE DATABASE libreria;
USE libreria;
CREATE TABLE SOCIS (
    dni CHAR(9) PRIMARY KEY,
    nom VARCHAR(15)
);
CREATE TABLE LLIBRES (
    codi INT PRIMARY KEY,
    titol VARCHAR(40)
);
CREATE TABLE DEMANAR (
    soci CHAR(9),
    llibre INT,
    data DATE NOT NULL,
    PRIMARY KEY (soci, llibre),
    CONSTRAINT SOCIS_FK FOREIGN KEY (soci) REFERENCES SOCIS(dni),
    CONSTRAINT LLIBRES_FK FOREIGN KEY (llibre) REFERENCES LLIBRES(codi)
        ON DELETE CASCADE
);

CREATE TABLE PRESTAR (
    soci CHAR(9),
    llibre INT,
    d_prestec DATE NOT NULL,
    d_dev DATE,
    PRIMARY KEY (soci, llibre),
    CONSTRAINT SOCIS_FKK FOREIGN KEY (soci) REFERENCES SOCIS(dni),
    CONSTRAINT LLIBRES_FKK FOREIGN KEY (llibre) REFERENCES LLIBRES(codi)
        ON DELETE CASCADE
);

--2
INSERT INTO LLIBRES (codi, titol)
    VALUES (1, 'Bases de Datos'),
           (2, 'Programacion'),
           (3, 'Sistemas'),
           (4, 'HTML'),
           (5, 'Ingés');
--3
INSERT INTO SOCIS (dni, nom)
    VALUES ('11111111A', 'Antonio'),
           ('22222222B', 'Maria'),
           ('33333333C', 'Vicent'),
           ('44444444D', 'Paula');
           
--4
CREATE TABLE POBLACIONS (
    cpo CHAR(5) PRIMARY KEY,
    nombre VARCHAR(25)
);

--5
ALTER TABLE SOCIS ADD COLUMN poblacio CHAR(5);
ALTER TABLE SOCIS ADD FOREIGN KEY (poblacio) REFERENCES POBLACIONS(cpo)
    ON UPDATE CASCADE
    ON DELETE SET NULL

--6
--Modificacions directament en la taula

--7
--Modificacions directament en la taula

--8
INSERT INTO POBLACIONS (cpo, nombre)
    VALUES ('46001', 'Cullera'),
           ('46002', 'Sueca'),
           ('46003', 'Tavernes');

--9
INSERT INTO DEMANAR (soci, llibre, data)
    VALUES ('11111111A', 1, 10/20/2023),
           ('22222222B', 5, 10/20/2023),
           ('33333333C', 2, 10/20/2023),
           ('44444444D', 4, 10/20/2023);

--10
INSERT INTO PRESTAR (soci, llibre, d_prestec, d_dev)
    VALUES ('22222222B', 2, 01/21/2024, 01/23/2024),
           ('44444444D', 4, 01/22/2024, 01/23/2024),
           ('11111111A', 5, 01/23/2024, 01/23/2024);

--11
UPDATE PRESTAR
    SET d_dev=01/25/2024
WHERE soci="11111111A";

UPDATE PRESTAR
    SET d_dev=01/26/2024
WHERE soci="44444444D";

--12
INSERT INTO LLIBRES (codi, titol)
    VALUES (6, 'LMI');

INSERT INTO SOCIS (dni, nom)
    VALUES ('55555555E', 'Josep');

INSERT INTO DEMANAR (soci, llibre, data)
    VALUES ('55555555E',6 , 01/31/2024);
           
--13
DELETE FROM LLIBRES
    WHERE codi=6;

DELETE FROM SOCIS
    WHERE dni='55555555E';

DELETE FROM DEMANAR
    WHERE soci='55555555E';

--14
ALTER TABLE POBLACIONS DROP PRIMARY KEY; 

--15
DROP TABLE IF EXISTS POBLACIONS;

--16
DROP DATABASE IF EXISTS libreria;