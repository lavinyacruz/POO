create database if not exists sistema_cadastro;

use sistema_cadastro;

create table if not exists Sensor(
id int auto_increment primary key,
codigo int,
tipo varchar(100) not null,
localizacao varchar(100) not null
);

create table if not exists Medicao (
id_medicao int auto_increment primary key,
valor int,
unidade varchar (100) not null,
dataHora int,
sensor varchar (100) not null
);