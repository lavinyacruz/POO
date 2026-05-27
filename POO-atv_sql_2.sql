create database loja;

use loja;

create table  produtos (
id int primary key auto_increment,
nome varchar(100) not null,
preco decimal(10,2),
quantidade int
);

describe produtos;

insert into produtos (nome, preco, quantidade)
values ('Notebook',3000.00,10);

insert into produtos (nome,preco,quantidade)
values
('Mouse',80.00,50),
('Teclado',150.00,30),
('Monitor',1200.00,15);

select*from produtos;

select nome, preco
from produtos;

select*
from produtos
where preco>100;

select*
from produtos
where nome = 'Mouse';

update produtos 
set preco = 3400
where id=1;

update produtos 
set quantidade = 45
where nome = 'Mouse';

delete from produtos
where id=3;

select*from produtos;


