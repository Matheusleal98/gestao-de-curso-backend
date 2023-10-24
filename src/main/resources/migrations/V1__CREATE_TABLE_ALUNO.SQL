CREATE TABLE tb_aluno (
                          id SERIAL PRIMARY KEY,
                          ra INTEGER NOT NULL,
                          nome VARCHAR(255) NOT NULL,
                          email VARCHAR(255) NOT NULL,
                          dt_nascimento DATE NOT NULL
);