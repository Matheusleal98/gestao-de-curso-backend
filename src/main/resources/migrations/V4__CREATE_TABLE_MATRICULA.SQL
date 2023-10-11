CREATE TABLE tb_matricula (
    id BIGSERIAL PRIMARY KEY,
    aluno_id INTEGER,
    curso_id INTEGER,
    dt_matricula VARCHAR (8),
    status VARCHAR(50),
    FOREIGN KEY (aluno_id) REFERENCES tb_aluno(id),
    FOREIGN KEY (curso_id) REFERENCES tb_curso(id)
);