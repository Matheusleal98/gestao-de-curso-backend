CREATE TABLE tb_curso (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(100),
    descricao VARCHAR(100),
    instutor_id INTEGER,
    FOREIGN KEY (instutor_id) REFERENCES tb_instrutor(id)
);