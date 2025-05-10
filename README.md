# Hello World Application

Uma aplicação simples "Hello World" construída com Java 21, Spring Boot e seguindo o modelo Clean Architecture.

## Requisitos
- [Java 21](SETUP.md#como-instalar-o-java-21)
- [Maven 3.8+](SETUP.md#como-instalar-o-maven)
- [Docker](SETUP.md#como-instalar-o-docker)

Certifique-se de que todas as ferramentas acima estão instaladas antes de executar a aplicação.

---

## Como Executar a Aplicação Localmente

1. Clone o repositório:
   ```bash
   git clone https://github.com/kzar1n/api-example.git
   cd api-example
   ```

2. Suba todos os containers necessários (banco de dados e aplicação) usando o comando:
   ```bash
   docker-compose up -d
   ```

3. Verifique se os containers estão em execução:
   ```bash
   docker ps
   ```

4. Acesse o endpoint da API para testar:
   ```bash
   GET http://localhost:8081/api/v1/greeting/{uuid}
   ```
   Substitua `{uuid}` por um UUID válido, como `123e4567-e89b-12d3-a456-426614174000`.

5. Exemplo de resposta:
   ```json
   {
       "message": "Hello, World!"
   }
   ```

---

### Parar os Containers
Para parar e remover todos os containers, use o comando:
```bash
docker-compose down
```

---

## Estrutura do Projeto

**domain:** Contém as entidades do domínio.  
**application:** Contém os casos de uso.  
**adapters/controllers:** Contém os controladores REST.

## Testes
Para executar os testes automatizados, use o comando:
```bash
mvn test
```

Os testes verificam o comportamento da API, incluindo a validação do UUID no endpoint.

---
