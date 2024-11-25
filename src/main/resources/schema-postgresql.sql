CREATE TABLE IF NOT EXISTS cliente (
    id serial PRIMARY KEY,
    nome VARCHAR(50),
    cpf VARCHAR(11),
    email VARCHAR (50),
    nivel VARCHAR (10)
);