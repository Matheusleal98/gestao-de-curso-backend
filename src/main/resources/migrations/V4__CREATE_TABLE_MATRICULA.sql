CREATE TABLE tb_matricula (
    id SERIAl PRIMARY KEY,
    aluno_id INTEGER NOT NULL,
    curso_id INTEGER NOT NULL,
    dt_matricula DATE NOT NULL,
    status VARCHAR(255) NOT NULL,
    FOREIGN KEY (aluno_id) REFERENCES tb_aluno(id),
    FOREIGN KEY (curso_id) REFERENCES tb_instrutor(id)
)
