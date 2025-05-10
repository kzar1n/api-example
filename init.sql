-- Criação da tabela `greetings` com UUID como chave primária
CREATE TABLE greetings (
    id BINARY(16) PRIMARY KEY, -- Campo para armazenar UUID em formato binário
    message VARCHAR(255) NOT NULL
);

-- Inserir dados iniciais com UUIDs
INSERT INTO greetings (id, message) VALUES (UUID_TO_BIN('123e4567-e89b-12d3-a456-426614174000'), 'Hello, World!');
INSERT INTO greetings (id, message) VALUES (UUID_TO_BIN('323e4567-e89b-12d3-a456-426614174002'), 'Hello, Aurora MySQL!');