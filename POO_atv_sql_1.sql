create database pessoa;

Use pessoa;

create table pessoas (
id INT PRIMARY KEY auto_increment,
nome VARCHAR(100) NOT NULL,
idade int,
email varchar(50)
);

Describe pessoas;

INSERT INTO pessoas (nome,idade,email)
VALUES('Maria',25,'maria@gmail.com');

select*from pessoas;

select nome, idade from pessoas;

select*from pessoas where nome='Maria';

update pessoas set nome = 'Debora Moura'
where id = 1;

select*from pessoas;

delete from pessoas where id=1;
delete from pessoas where id=2;

select*from pessoas;

