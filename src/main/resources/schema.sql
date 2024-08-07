CREATE TABLE usuario (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    idade INT,
    email VARCHAR(255)
);

CREATE TABLE endereco (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    cep VARCHAR(10),
    complemento VARCHAR(255),
    uf VARCHAR(2)
);

CREATE TABLE telefone (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    ddd VARCHAR(3),
    numero VARCHAR(10),
    usuario_id BIGINT,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

CREATE TABLE usuario_endereco (
    usuario_id BIGINT,
    endereco_id BIGINT,
    PRIMARY KEY (usuario_id, endereco_id),
    FOREIGN KEY (usuario_id) REFERENCES usuario(id),
    FOREIGN KEY (endereco_id) REFERENCES endereco(id)
);
