-- Active: 1704873046558@@192.168.56.101@3306
DROP DATABASE IF EXISTS empresa;
CREATE DATABASE empresa;
USE empresa;
CREATE TABLE POBLACIONS (
    cpo CHAR(5) PRIMARY KEY,
    nom VARCHAR(30)
);

CREATE TABLE CLIENTS (
    codi INT PRIMARY KEY,
    nif VARCHAR(9) UNIQUE,
    nom VARCHAR(30) NOT NULL,
    domicili VARCHAR(20),
    poblacio VARCHAR(20),
    tel VARCHAR(9),
    data_naix DATE,
    deute_pts INTEGER,
    FOREIGN KEY (poblacio) REFERENCES POBLACIONS(cpo)
        ON DELETE SET NULL
        ON UPDATE CASCADE
);
insert into POBLACIONS (cpo, nom) 
    values ('46723', 'Benicolet'),
            ('46001', 'Madrid'),
            ('46701', 'Gandia');
insert into CLIENTS (codi, nif, nom, domicili, poblacio, tel, data_naix, deute_pts) values (1, 'cliente1', 'Javi', 'C/la dula', '46723', 't1', '1995/03/20', 20);
delete FROM CLIENTS;
ALTER TABLE CLIENTS ADD COLUMN deute_eur DECIMAL(12.2);

UPDATE CLIENTS set deute_eur = deute_pts / 166,386;

ALTER TABLE CLIENTS CHANGE COLUMN poblacio poble CHAR(5);

ALTER TABLE CLIENTS
    ADD COLUMN familiar BOOLEAN after tel;
    
UPDATE CLIENTS 
    SET familiar = 1. deute_pts
