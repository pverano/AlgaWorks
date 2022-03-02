create table TB_CLIENTE(
id int(100) auto_increment,
nome varchar(30) NOT NULL,
idade int(3),
PRIMARY KEY(id));

insert into TB_CLIENTE(nome, idade) values ('Nataniel', 29);