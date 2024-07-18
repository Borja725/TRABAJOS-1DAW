DROP DATABASE IF EXISTS borja_institut;
CREATE DATABASE borja_institut;
USE borja_institut;

CREATE TABLE ALUMNES (
    n_exp INT PRIMARY KEY,
    edad INTEGER,
    nom VARCHAR(30) NOT NULL,
    tel VARCHAR(9),
    pes INT
);

CREATE TABLE ASSIGNATURES (
    codi INT PRIMARY KEY,
    des VARCHAR(30)
);

CREATE TABLE MATRICULAR (
    alumne INT,
    assig INT,
    nota DECIMAL(3,1),
    PRIMARY KEY (alumne, assig),
    FOREIGN KEY (alumne) REFERENCES ALUMNES(n_exp)
        ON UPDATE CASCADE,
    FOREIGN KEY (assig) REFERENCES ASSIGNATURES(codi)
        ON UPDATE CASCADE
);

INSERT INTO ALUMNES(n_exp, edad, nom, tel, pes)
    VALUES (1, 20, 'Josep Segarra', '633879284', 72),
           (2, 18, 'Jorge Molio', '622548236', 81),
           (3, 22, 'Samuel Mascarell', '673241884', 67);

INSERT INTO ASSIGNATURES(codi, des)
    VALUES (15, 'PRG'),
           (16, 'BDD'),
           (17, 'LMI');

INSERT INTO MATRICULAR (alumne, assig, nota)
    VALUES (2, 15, 7.1),
           (1, 15, 2.2),
           (3, 16, 3.5),
           (2, 17, 9.1),
           (1, 16, 8.7);


ALTER TABLE ALUMNES DROP COLUMN pes;