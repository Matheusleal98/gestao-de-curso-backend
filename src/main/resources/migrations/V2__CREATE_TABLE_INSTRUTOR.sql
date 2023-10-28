CREATE TABLE tb_instrutor (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255)  NOT NULL,
    email VARCHAR(255) NOT NULL,
    especializacao VARCHAR(255) NOT NULL
);