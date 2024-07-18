-- a) crear las bases de datos y restricciones
drop database if exists borja_empresa;
create database borja_empresa;
use borja_empresa;
create table poblacions (
    cpo char(5) primary key,
    nom varchar(30)
);

create table clients (
    codi int primary key,
    nom varchar(30) not null,
    nif varchar(9) unique,
    domicili varchar(30),
    poblacio char(5),
    tel varchar(9),
    data_naix date,
    deute_pts int,
    foreign key (poblacio) references poblacions(cpo)
        on delete set null
        on update cascade
);

-- b) insertar datos

insert into poblacions (cpo, nom)
    values ('47001', 'Valencia'),
            ('46401', 'Cullera'),
            ('46760', 'Tavernes'),
            ('28000', 'Madrid');

insert into clients (codi, nom, nif, domicili, poblacio, tel, data_naix, deute_pts)
    values (1, 'cliente1',  'aA', 'd1', '47001', 't1', '2000/01/20', 1000);

insert into clients (codi, nom, nif, domicili, poblacio, tel, data_naix, deute_pts)
    values (2, 'cliente2',  'bA', 'd2', '46401', 't2', '2002/01/20', 2000),
            (3, 'cliente3',  'cA', 'd3', '46760', 't3', '2003/01/20', 3000),
            (4, 'cliente4',  'dA', 'd4', '47001', 't4', '2004/01/20', 4000);


-- 3 modificar taula clients
alter table clients add column deute_eur decimal(12,2);

-- 4
update clients set deute_eur = deute_pts / 166.386;

-- 5

alter table poblacions rename pobles;

-- 6

alter table clients change column poblacio poble char(5);

-- 7
alter table clients
    add column familiar boolean after tel;

-- 8

update clients
    set familiar = 1, deute_pts = 0, deute_eur = 0
where codi = 1;
