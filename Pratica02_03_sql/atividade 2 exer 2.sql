-- Criação do banco de dados
CREATE DATABASE IF NOT EXISTS oficina;
USE oficina;

-- Criação da tabela cliente
CREATE TABLE cliente (
    cpf VARCHAR(14) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data_nascimento DATE NOT NULL,
    telefone VARCHAR(15),
    endereco VARCHAR(255)
);

-- Criação da tabela veículo
CREATE TABLE veiculo (
    chassi VARCHAR(17) PRIMARY KEY,
    placa VARCHAR(10) NOT NULL UNIQUE,
    modelo VARCHAR(50) NOT NULL,
    marca VARCHAR(50) NOT NULL,
    ano INT NOT NULL
);

-- Criação da tabela mecânico
CREATE TABLE mecanico (
    cpf VARCHAR(14) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data_nascimento DATE NOT NULL,
    telefone VARCHAR(15),
    endereco VARCHAR(255),
    salario DECIMAL(10, 2) NOT NULL
);

-- Inserção de registros na tabela cliente  (Create)
INSERT INTO cliente (cpf, nome, data_nascimento, telefone, endereco)
VALUES 
('123.456.789-00', 'Carlos Silva', '1985-10-12', '31999990000', 'Rua A, 123'),
('987.654.321-00', 'Ana Souza', '1990-05-22', '31988880000', 'Rua B, 456');

-- Inserção de registros na tabela veículo (Create)
INSERT INTO veiculo (chassi, placa, modelo, marca, ano)
VALUES 
('1HGCM82633A123456', 'ABC-1234', 'Civic', 'Honda', 2020),
('2FMDK3GC4BBB56789', 'DEF-5678', 'Edge', 'Ford', 2018);

-- Inserção de registros na tabela mecânico (Create)
INSERT INTO mecanico (cpf, nome, data_nascimento, telefone, endereco, salario)
VALUES 
('456.789.123-11', 'João Mecânico', '1980-03-14', '31977770000', 'Rua C, 789', 2500.00),
('321.654.987-22', 'Marcos Reparador', '1975-11-05', '31966660000', 'Rua D, 987', 3000.00);

-- Leitura dos registros (Read)
SELECT * FROM cliente;
SELECT * FROM veiculo;
SELECT * FROM mecanico;

-- Atualização de um registro na tabela cliente (Update)
UPDATE cliente
SET telefone = '31955550000', endereco = 'Rua E, 321'
WHERE cpf = '123.456.789-00';

-- Atualização de um registro na tabela veículo (Update)
UPDATE veiculo
SET modelo = 'Corolla', marca = 'Toyota', ano = 2021
WHERE chassi = '1HGCM82633A123456';

-- Atualização de um registro na tabela mecânico (Update)
UPDATE mecanico
SET salario = 3200.00
WHERE cpf = '321.654.987-22';

-- Exclusão de um registro na tabela cliente (Delete)
DELETE FROM cliente
WHERE cpf = '987.654.321-00';

-- Exclusão de um registro na tabela veículo (Delete)
DELETE FROM veiculo
WHERE placa = 'DEF-5678';

-- Exclusão de um registro na tabela mecânico (Delete)
DELETE FROM mecanico
WHERE cpf = '456.789.123-11';

-- Leitura final após as exclusões
SELECT * FROM cliente;
SELECT * FROM veiculo;
SELECT * FROM mecanico;
