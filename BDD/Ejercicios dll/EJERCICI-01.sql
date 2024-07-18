CREATE DATABASE if NOT EXISTS CULTIUS;
USE CULTIUS;
DROP TABLE IF EXISTS TIPUS_CULTIUS;
CREATE TABLE TIPUS_CULTIUS (
    cod VARCHAR(3) PRIMARY KEY,
    nom VARCHAR(30)
);
DROP TABLE IF EXISTS PAISOS;
CREATE TABLE PAISOS (
    cod VARCHAR(3) PRIMARY KEY,
    nom VARCHAR(30),
    con VARCHAR(30)
);
DROP TABLE IF EXISTS PROVINCIES;
CREATE TABLE PROVINCIES (
    cod VARCHAR(3),
    pai VARCHAR(3),
    nom VARCHAR(30),
    hab INTEGER,
    PRIMARY KEY (cod, pai),
    FOREIGN KEY (pai) REFERENCES PAISOS(cod)
);
DROP TABLE IF EXISTS COMARQUES;
CREATE TABLE COMARQUES (
    cod VARCHAR(3) PRIMARY KEY,
    nom VARCHAR(30),
    pro VARCHAR(30) NOT NULL,
    pai VARCHAR(30) NOT NULL,
    FOREIGN KEY (pro, pai) REFERENCES PROVINCIES(cod, pai)
        ON UPDATE CASCADE
);
DROP TABLE IF EXISTS CULTIVAR;
CREATE TABLE CULTIVAR (
    cul VARCHAR(30),
    com VARCHAR(30),
    PRIMARY KEY (cul, com),
    FOREIGN KEY (cul) REFERENCES TIPUS_CULTIUS(cod)
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    FOREIGN KEY (com) REFERENCES COMARQUES(cod)
)