CREATE TABLE IF NOT EXISTS funcionarios (

    id UUID NOT NULL,
	nome VARCHAR(50) NOT NULL,
    cpf  VARCHAR(15) NOT NULL,
    email VARCHAR(50),
    phone  VARCHAR(15),
    birth_date DATE,
    created_ate TIMESTAMP
);