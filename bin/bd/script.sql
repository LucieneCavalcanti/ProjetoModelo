create database bdProjetoModelo

use bdProjetoModelo

create table tbCategorias(
    id int not null identity primary key, 
    descricao varchar(50) not null
)
create table tbProdutos(
    id int not null identity primary key,
    descricao varchar(200) not null,
    quantidade int not null,
    precoVenda decimal(10,2) not null,
    idCategoria int not null 
    references tbCategorias(id)
)
create table tbLotes(
    numero int not null identity primary key,
    data varchar(10) not null,
    idProduto int not null references tbProdutos(id)
)
create table tbClientes(
    id int not null identity primary key,
    nome varchar(100) not null,
    cpf varchar(14) not null
)
create table tbVendas(
    id int not null identity primary key,
    data varchar(10) not null,
    formaPagamento varchar(20) not null,
    idCliente int not null references tbClientes(id)
)
create table tbItensVendas(
    id int not null identity primary key,
    idVenda int references tbVendas(id),
    idProduto int references tbProdutos(id),
    quantidade int not null,
    valor decimal(10,2) not null
)