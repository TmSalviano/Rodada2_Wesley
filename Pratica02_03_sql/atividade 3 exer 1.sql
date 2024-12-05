--  Criação da tabela "produto"
create table if not exists produto (
    id int auto_increment primary key,
    nome varchar(128),
    categoria varchar(256),
    preco double,
    validade date
);

-- 15) Verificar registros na tabela
select * from produto;

-- 16) Remover registros existentes
truncate produto;

-- 17) Verificar se os registros foram excluídos
select * from produto;

-- 18) Inserir produtos
insert into produto (nome, categoria, preco, validade) values ('arroz', 'alimentício', 16.57, '2023-12-17');
insert into produto (nome, categoria, preco, validade) values ('detergente', 'limpeza', 3.97, '2037-08-23');
insert into produto (nome, categoria, preco, validade) values ('calça', 'vestuário', 184.91, '2045-01-27');
insert into produto (nome, categoria, preco, validade) values ('desinfetante', 'limpeza', 8.60, '2036-02-14');
insert into produto (nome, categoria, preco, validade) values ('camisa', 'vestuário', 48.99, '2043-04-03');
insert into produto (nome, categoria, preco, validade) values ('feijão', 'alimentício', 12.31, '2023-09-11');
insert into produto (nome, categoria, preco, validade) values ('vestido', 'vestuário', 89.99, '2041-05-16');
insert into produto (nome, categoria, preco, validade) values ('leite', 'alimentício', 4.28, '2023-10-03');
insert into produto (nome, categoria, preco, validade) values ('sabão', 'limpeza', 1.85, '2035-03-05');

-- 19) Apresentar todos os atributos dos produtos
select * from produto;

-- 20) Apresentar nome e preço dos produtos
select nome, preco from produto;

-- 21) Apresentar nome e preço com rótulos
select nome as 'Nome dos Produtos', preco as 'Preço dos Produtos' from produto;

-- 22) Ordenar produtos em ordem crescente de preço
select * from produto order by preco asc;

-- 23) Ordenar produtos em ordem decrescente de preço
select * from produto order by preco desc;

-- 24) Ordenar por categoria crescente e preço decrescente
select * from produto order by categoria asc, preco desc;

-- 25) Categorias decrescentes, nomes e preços crescentes
select categoria, nome, preco from produto order by categoria desc, nome asc, preco asc;

-- 26) Soma dos preços
select sum(preco) from produto;

-- 27) Média dos preços
select avg(preco) from produto;

-- 28) Maior preço
select max(preco) from produto;

-- 29) Menor preço
select min(preco) from produto;

-- 30) Número de produtos registrados
select count(id) from produto;

-- 31) Soma dos preços por categoria
select categoria, sum(preco) as 'Soma dos Preços' from produto group by categoria;

-- 32) Soma dos preços por categoria, ordenando categorias decrescentes
select categoria, sum(preco) as 'Soma dos Preços' from produto group by categoria order by categoria desc;

-- 33) Soma dos preços por categoria, ordenando soma em ordem decrescente
select categoria, sum(preco) as 'Soma dos Preços' from produto group by categoria order by sum(preco) desc;

-- 34) Categorias cuja soma dos preços > R$30
select categoria, sum(preco) as 'Soma dos Preços' from produto group by categoria having sum(preco) > 30;

-- 35) Categorias cuja soma dos preços > R$30, ordenando soma decrescente
select categoria, sum(preco) as 'Soma dos Preços' from produto group by categoria having sum(preco) > 30 order by sum(preco) desc;

-- 36) Remover a tabela "produto"
drop table if exists produto;

-- 37) Criar tabelas relacionadas 1:1
create table produto (
    id int auto_increment not null,
    nome varchar(128) not null,
    preco double not null,
    validade date not null,
    unique(nome),
    constraint pk_produto primary key (id)
);

create table identificacao (
    id int not null,
    nome varchar(128) not null,
    descricao varchar(256) not null,
    constraint pk_identificacao primary key (id),
    constraint fk_identificacao foreign key (id) references produto (id)
);

-- 38) Inserir produtos na tabela "produto"
insert into produto (nome, preco, validade) values ('arroz', 16.57, '2023-12-17');
insert into produto (nome, preco, validade) values ('detergente', 3.97, '2037-08-23');
insert into produto (nome, preco, validade) values ('calça', 184.91, '2045-01-27');
insert into produto (nome, preco, validade) values ('desinfetante', 8.60, '2036-02-14');
insert into produto (nome, preco, validade) values ('camisa', 48.99, '2043-04-03');
insert into produto (nome, preco, validade) values ('feijão', 12.31, '2023-09-11');
insert into produto (nome, preco, validade) values ('vestido', 89.99, '2041-05-16');
insert into produto (nome, preco, validade) values ('leite', 4.28, '2023-10-03');
insert into produto (nome, preco, validade) values ('sabão', 1.85, '2035-03-05');

-- 39) Inserir identificações na tabela "identificacao"
insert into identificacao (id, nome, descricao) values (1, 'parboilizado', 'pré-cozido');
insert into identificacao (id, nome, descricao) values (2, 'neutro', 'sem corante e aditivos');
insert into identificacao (id, nome, descricao) values (3, 'jeans', 'reta');
insert into identificacao (id, nome, descricao) values (4, 'cloro', 'bactericida');
insert into identificacao (id, nome, descricao) values (5, 'algodão', 'sem estampa');
insert into identificacao (id, nome, descricao) values (6, 'carioca', 'orgânico');
insert into identificacao (id, nome, descricao) values (7, 'algodão', 'estampado');
insert into identificacao (id, nome, descricao) values (8, 'integral', 'com vitaminas');
insert into identificacao (id, nome, descricao) values (9, 'barra', 'banho');

-- 40) Apresentar todos os produtos com identificações
select * from produto as p, identificacao as i where p.id = i.id;

-- 41) Apresentar identificador, nome, descrição e preço
select p.id, p.nome, i.descricao, p.preco from produto as p, identificacao as i where p.id = i.id;

-- Exercício 1.a) Ordenar por preço decrescente
select p.id, p.nome, i.descricao, p.preco from produto as p, identificacao as i where p.id = i.id order by p.preco desc;

-- Exercício 1.b) Ordenar por nome crescente e preço decrescente
select p.id, p.nome, i.descricao, p.preco from produto as p, identificacao as i where p.id = i.id order by p.nome asc, p.preco desc;

-- Insira novos registros e continue agrupamentos conforme solicitado.
