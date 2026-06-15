create database laboratorio;

use laboratorio;

create table labs(
id int primary key auto_increment,
nome varchar(100) not null,
bloco int,
capacidade int not null,
responsvel varchar(100) not null
);
