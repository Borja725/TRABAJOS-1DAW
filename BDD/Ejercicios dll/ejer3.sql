DROP DATABASE IF EXISTS borja_subministrar;
CREATE DATABASE borja_subministrar;
USE borja_subministrar;

CREATE TABLE PROVEIDORS (
    dni VARCHAR(9) PRIMARY KEY,
    nom VARCHAR(30) NOT NULL,
    domicili VARCHAR(30),
    ciutat VARCHAR(30)
);

CREATE TABLE ARTICLES (
    codi CHAR(4) PRIMARY KEY,
    color VARCHAR(25),
    des VARCHAR(40),
    pes INT 
);

CREATE TABLE SUBMINISTRAMENTS (
    pro VARCHAR(9),
    art CHAR(4),
    preu DECIMAL(10,2),
    PRIMARY KEY (pro, art),
    FOREIGN KEY (pro) REFERENCES PROVEIDORS(dni),
    FOREIGN KEY (art) REFERENCES ARTICLES(codi)
);

CREATE TABLE PROJECTES (
    codi INT PRIMARY KEY,
    pressupost DECIMAL(10,2),
    quantitat INT,
    pro VARCHAR(9),
    art CHAR(4),
    FOREIGN KEY (pro, art) REFERENCES SUBMINISTRAMENTS(pro, art)
);

INSERT INTO PROVEIDORS(dni, nom, domicili, ciutat)
    VALUES ('20953265T', 'Andrea Vercher', 'La dula, 23', 'Tavernes de la Valldigna'),
           ('20755295D', 'Javi Beteta', 'Roig de Corella, 7', 'Gandia');

INSERT INTO ARTICLES(codi, color, des, pes)
    VALUES ('1000', 'Blanc', 'papelera', 1200),
           ('1001', 'Roig', 'pantalo', 200);

INSERT INTO SUBMINISTRAMENTS(pro, art, preu)
    VALUES ('2223331A', '1000', 12.99),
           ('4443321C', '1001', 25.99);

INSERT INTO PROJECTES(codi, pressupost, pro, art)
    VALUES (1000, 1200, '2223331A', '1000'),
           (1001, 1750, '4443321C', '1001');