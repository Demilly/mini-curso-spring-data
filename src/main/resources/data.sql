-- Inserindo usuários
INSERT INTO usuario (nome, idade, email) VALUES ('João da Silva', 30, 'joao.silva@example.com');
INSERT INTO usuario (nome, idade, email) VALUES ('Maria Oliveira', 25, 'maria.oliveira@example.com');
INSERT INTO usuario (nome, idade, email) VALUES ('Pedro Santos', 40, 'pedro.santos@example.com');
INSERT INTO usuario (nome, idade, email) VALUES ('Ana Costa', 28, 'ana.costa@example.com');
INSERT INTO usuario (nome, idade, email) VALUES ('Carlos Pereira', 35, 'carlos.pereira@example.com');
INSERT INTO usuario (nome, idade, email) VALUES ('Julia Almeida', 32, 'julia.almeida@example.com');
INSERT INTO usuario (nome, idade, email) VALUES ('Roberto Lima', 45, 'roberto.lima@example.com');
INSERT INTO usuario (nome, idade, email) VALUES ('Fernanda Martins', 29, 'fernanda.martins@example.com');
INSERT INTO usuario (nome, idade, email) VALUES ('Lucas Fernandes', 31, 'lucas.fernandes@example.com');
INSERT INTO usuario (nome, idade, email) VALUES ('Paula Ribeiro', 27, 'paula.ribeiro@example.com');

-- Inserindo endereços
INSERT INTO endereco (nome, cep, complemento, uf) VALUES ('Rua das Flores', '12345-678', 'Apto 101', 'SP');
INSERT INTO endereco (nome, cep, complemento, uf) VALUES ('Avenida Paulista', '98765-432', 'Sala 202', 'SP');
INSERT INTO endereco (nome, cep, complemento, uf) VALUES ('Rua das Laranjeiras', '54321-678', 'Casa 303', 'RJ');
INSERT INTO endereco (nome, cep, complemento, uf) VALUES ('Praça da Sé', '67890-123', '', 'SP');
INSERT INTO endereco (nome, cep, complemento, uf) VALUES ('Rua do Catete', '23456-789', 'Apto 404', 'RJ');
INSERT INTO endereco (nome, cep, complemento, uf) VALUES ('Avenida Central', '34567-890', 'Sala 505', 'MG');
INSERT INTO endereco (nome, cep, complemento, uf) VALUES ('Rua das Acácias', '45678-901', 'Casa 606', 'ES');
INSERT INTO endereco (nome, cep, complemento, uf) VALUES ('Rua do Ouvidor', '56789-012', 'Apto 707', 'BA');
INSERT INTO endereco (nome, cep, complemento, uf) VALUES ('Avenida Brasil', '67890-123', 'Sala 808', 'SP');
INSERT INTO endereco (nome, cep, complemento, uf) VALUES ('Rua da Harmonia', '78901-234', 'Casa 909', 'SP');

-- Inserindo telefones
INSERT INTO telefone (ddd, numero, usuario_id) VALUES ('11', '1234-5678', 1);
INSERT INTO telefone (ddd, numero, usuario_id) VALUES ('11', '8765-4321', 1);
INSERT INTO telefone (ddd, numero, usuario_id) VALUES ('21', '2345-6789', 2);
INSERT INTO telefone (ddd, numero, usuario_id) VALUES ('31', '3456-7890', 3);
INSERT INTO telefone (ddd, numero, usuario_id) VALUES ('11', '4567-8901', 4);
INSERT INTO telefone (ddd, numero, usuario_id) VALUES ('21', '5678-9012', 5);
INSERT INTO telefone (ddd, numero, usuario_id) VALUES ('31', '6789-0123', 6);
INSERT INTO telefone (ddd, numero, usuario_id) VALUES ('21', '7890-1234', 7);
INSERT INTO telefone (ddd, numero, usuario_id) VALUES ('11', '8901-2345', 8);
INSERT INTO telefone (ddd, numero, usuario_id) VALUES ('31', '9012-3456', 9);

-- Associando usuários e endereços (usuario_endereco)
INSERT INTO usuario_endereco (usuario_id, endereco_id) VALUES (1, 1);
INSERT INTO usuario_endereco (usuario_id, endereco_id) VALUES (1, 2);
INSERT INTO usuario_endereco (usuario_id, endereco_id) VALUES (1, 3);
INSERT INTO usuario_endereco (usuario_id, endereco_id) VALUES (2, 4);
INSERT INTO usuario_endereco (usuario_id, endereco_id) VALUES (2, 5);
INSERT INTO usuario_endereco (usuario_id, endereco_id) VALUES (3, 6);
INSERT INTO usuario_endereco (usuario_id, endereco_id) VALUES (4, 7);
INSERT INTO usuario_endereco (usuario_id, endereco_id) VALUES (5, 8);
INSERT INTO usuario_endereco (usuario_id, endereco_id) VALUES (6, 9);
INSERT INTO usuario_endereco (usuario_id, endereco_id) VALUES (7, 10);
INSERT INTO usuario_endereco (usuario_id, endereco_id) VALUES (8, 1);
INSERT INTO usuario_endereco (usuario_id, endereco_id) VALUES (9, 2);
INSERT INTO usuario_endereco (usuario_id, endereco_id) VALUES (10, 3);
