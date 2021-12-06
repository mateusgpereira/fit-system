CREATE TABLE instructor (
  id BIGSERIAL PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL UNIQUE,
  age SMALLINT,
  password  VARCHAR(255) NOT NULL,
  phone VARCHAR(20) NOT NULL,
  cpf VARCHAR(12) NOT NULL UNIQUE,
  createdAt DATE NOT NULL DEFAULT CURRENT_DATE,
  updatedAt TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);