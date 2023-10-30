CREATE TABLE tb_curso (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    instrutor_id INTEGER NOT NULL,
    FOREIGN KEY (instrutor_id) REFERENCES tb_instrutor(id)
)