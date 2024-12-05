-- Criação da tabela "novo_usuario"
CREATE TABLE novo_usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(128) NOT NULL,
    email VARCHAR(256) NOT NULL UNIQUE,
    data_cadastro DATE NOT NULL
);

-- Criação da tabela "perfil_usuario"
CREATE TABLE perfil_usuario (
    id INT PRIMARY KEY,
    perfil VARCHAR(64) NOT NULL,
    descricao TEXT,
    CONSTRAINT fk_perfil_usuario FOREIGN KEY (id) REFERENCES novo_usuario (id)
);

-- Inserção de registros na tabela "novo_usuario"
INSERT INTO novo_usuario (nome, email, data_cadastro) VALUES 
('João Silva', 'joao.silva@email.com', '2024-01-15'),
('Maria Oliveira', 'maria.oliveira@email.com', '2024-02-01'),
('Carlos Souza', 'carlos.souza@email.com', '2024-03-10');

-- Inserção de registros na tabela "perfil_usuario"
INSERT INTO perfil_usuario (id, perfil, descricao) VALUES
(1, 'Administrador', 'Acesso total ao sistema'),
(2, 'Usuário Padrão', 'Acesso limitado ao sistema'),
(3, 'Convidado', 'Somente visualização de dados');

-- Consulta para exibir todos os usuários e seus perfis
SELECT u.id, u.nome, u.email, u.data_cadastro, p.perfil, p.descricao
FROM novo_usuario AS u
JOIN perfil_usuario AS p ON u.id = p.id;

-- Consulta para exibir os usuários em ordem decrescente de data de cadastro
SELECT u.id, u.nome, u.email, u.data_cadastro
FROM novo_usuario AS u
ORDER BY u.data_cadastro DESC;

-- Consulta para exibir os perfis agrupados e a quantidade de usuários em cada perfil
SELECT p.perfil, COUNT(u.id) AS quantidade_usuarios
FROM perfil_usuario AS p
JOIN novo_usuario AS u ON p.id = u.id
GROUP BY p.perfil;

-- Consulta para exibir os perfis com mais de 1 usuário (usando HAVING)
SELECT p.perfil, COUNT(u.id) AS quantidade_usuarios
FROM perfil_usuario AS p
JOIN novo_usuario AS u ON p.id = u.id
GROUP BY p.perfil
HAVING COUNT(u.id) > 1;

