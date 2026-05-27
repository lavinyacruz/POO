create database escola;

use escola;

create table alunos(
id int primary key auto_increment,
nome varchar(100) not null,
curso varchar(100),
nota decimal (10,2)
);

select * from alunos;

insert into alunos (nome, curso, nota) 
values ('Maria', 'Matematica', 9.00);

insert into alunos (nome, curso, nota) 
values
('Mariely','POO',10.00),
('Lavinya','Portugues',8.00);

select nome, curso
from alunos;

select*
from alunos
where nota>=7

select*
from alunos
where nome = 'Maria';

update alunos set nota = 6.00
where id = 1;

update alunos set curso = 'POO'
where id = 3;

delete from alunos where id=1;

select * from alunos;
