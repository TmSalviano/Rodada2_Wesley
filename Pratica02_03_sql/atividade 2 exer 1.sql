CREATE DATABASE IF NOT EXISTS escola;
USE escola;

CREATE TABLE aluno (
    matricula INT PRIMARY KEY AUTO_INCREMENT,
    cpf VARCHAR(14) NOT NULL UNIQUE,
    nome VARCHAR(100) NOT NULL,
    data_nascimento DATE NOT NULL,
    telefone VARCHAR(15),
    endereco VARCHAR(255)
);

CREATE TABLE curso (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT,
    valor_mensalidade DECIMAL(10, 2) NOT NULL,
    data_criacao DATE NOT NULL
);

CREATE TABLE unidade_curricular (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT,
    data_inicio DATE NOT NULL,
    data_termino DATE NOT NULL,
    carga_horaria INT NOT NULL
);

INSERT INTO aluno (cpf, nome, data_nascimento, telefone, endereco)
VALUES 
('123.456.789-00', 'João Silva', '2000-05-15', '31999990000', 'Rua A, 123'),
('987.654.321-00', 'Maria Souza', '1999-08-21', '31988880000', 'Rua B, 456');

INSERT INTO curso (nome, descricao, valor_mensalidade, data_criacao)
VALUES 
('Engenharia de Software', 'Curso sobre desenvolvimento de sistemas.', 1200.00, '2022-01-10'),
('Design Gráfico', 'Curso focado em design e criatividade.', 800.00, '2023-03-15');

INSERT INTO unidade_curricular (nome, descricao, data_inicio, data_termino, carga_horaria)
VALUES 
('Programação I', 'Introdução à programação.', '2023-02-01', '2023-06-01', 80),
('Banco de Dados', 'Estudo de bases de dados relacionais.', '2023-08-01', '2023-12-01', 60);

SELECT * FROM aluno;
SELECT * FROM curso;
SELECT * FROM unidade_curricular;
