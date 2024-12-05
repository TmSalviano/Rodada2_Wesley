-- Criação do banco de dados
CREATE DATABASE IF NOT EXISTS corretora;
USE corretora;

-- Criação da tabela cliente
CREATE TABLE cliente (
    cpf VARCHAR(14) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data_nascimento DATE NOT NULL,
    numero_agencia VARCHAR(10) NOT NULL,
    numero_conta VARCHAR(20) NOT NULL,
    telefone VARCHAR(15),
    endereco VARCHAR(255),
    perfil ENUM('conservador', 'moderado', 'arrojado', 'sofisticado', 'agressivo') NOT NULL
);

-- Criação da tabela ativo_financeiro
CREATE TABLE ativo_financeiro (
    codigo VARCHAR(10) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT NOT NULL,
    emissor VARCHAR(100),
    data_inicio DATE,
    data_fim DATE
);

-- Criação da tabela nota_corretagem
CREATE TABLE nota_corretagem (
    numero_nota INT PRIMARY KEY AUTO_INCREMENT,
    folha INT NOT NULL,
    data_compra DATE NOT NULL,
    codigo_ativo VARCHAR(10) NOT NULL,
    cpf_cliente VARCHAR(14) NOT NULL,
    quantidade INT NOT NULL,
    cotacao DECIMAL(10, 2) NOT NULL,
    valor_compra DECIMAL(10, 2) AS (quantidade * cotacao) STORED,
    custos DECIMAL(10, 2),
    FOREIGN KEY (codigo_ativo) REFERENCES ativo_financeiro(codigo) ON DELETE CASCADE,
    FOREIGN KEY (cpf_cliente) REFERENCES cliente(cpf) ON DELETE CASCADE
);

-- Inserção de registros na tabela cliente (Create)
INSERT INTO cliente (cpf, nome, data_nascimento, numero_agencia, numero_conta, telefone, endereco, perfil)
VALUES
('123.456.789-00', 'João Silva', '1985-05-12', '1234', '56789-0', '31999990000', 'Rua A, 123', 'conservador'),
('987.654.321-00', 'Maria Souza', '1990-08-21', '5678', '12345-6', '31988880000', 'Rua B, 456', 'agressivo');

-- Inserção de registros na tabela ativo_financeiro (Create)
INSERT INTO ativo_financeiro (codigo, nome, descricao, emissor, data_inicio, data_fim)
VALUES
('AC123', 'Ação XPTO', 'Ação de empresa do setor de tecnologia', 'Empresa XPTO', '2023-01-01', NULL),
('FI456', 'Fundo Imobiliário Alpha', 'Fundo de investimento em imóveis comerciais', 'Gestora Alpha', '2022-06-01', NULL);

-- Inserção de registros na tabela nota_corretagem (Create)
INSERT INTO nota_corretagem (folha, data_compra, codigo_ativo, cpf_cliente, quantidade, cotacao, custos)
VALUES
(1, '2023-10-15', 'AC123', '123.456.789-00', 10, 50.00, 2.50),
(2, '2023-11-20', 'FI456', '987.654.321-00', 5, 100.00, 5.00);

-- Leitura dos registros (Read)
SELECT * FROM cliente;
SELECT * FROM ativo_financeiro;
SELECT * FROM nota_corretagem;

-- Atualização de um registro na tabela cliente (Update)
UPDATE cliente
SET telefone = '31955550000', endereco = 'Rua Nova, 321'
WHERE cpf = '123.456.789-00';

-- Atualização de um registro na tabela ativo_financeiro (Update)
UPDATE ativo_financeiro
SET nome = 'Ação XPTO Modificada', descricao = 'Ação de tecnologia com alta performance'
WHERE codigo = 'AC123';

-- Atualização de um registro na tabela nota_corretagem (Update)
UPDATE nota_corretagem
SET quantidade = 15, custos = 3.00
WHERE numero_nota = 1;

-- Exclusão de um registro na tabela cliente (Delete)
DELETE FROM cliente
WHERE cpf = '987.654.321-00';

-- Exclusão de um registro na tabela ativo_financeiro (Delete)
DELETE FROM ativo_financeiro
WHERE codigo = 'FI456';

-- Exclusão de um registro na tabela nota_corretagem (Delete)
DELETE FROM nota_corretagem
WHERE numero_nota = 2;

-- Leitura final após as exclusões
SELECT * FROM cliente;
SELECT * FROM ativo_financeiro;
SELECT * FROM nota_corretagem;
