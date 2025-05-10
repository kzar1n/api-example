# Hello World Application

Uma aplicação simples "Hello World" construída com Java 21, Spring Boot e seguindo o modelo Clean Architecture.

## Requisitos
- Java 21
- Maven 3.8+
- Docker

### Como Instalar o Java 21
1. Acesse o site oficial do OpenJDK: [https://jdk.java.net/archive/](https://jdk.java.net/archive/).
2. Baixe o arquivo correspondente ao seu sistema operacional (Windows, Linux ou Mac).
3. Extraia o arquivo para um diretório, por exemplo: `C:\Java\jdk-21`.
4. Configure a variável de ambiente `JAVA_HOME`:
   - No Windows:
     1. Abra o **Painel de Controle** → **Sistema** → **Configurações Avançadas do Sistema**.
     2. Clique em **Variáveis de Ambiente**.
     3. Adicione uma nova variável chamada `JAVA_HOME` com o valor `C:\Java\jdk-21`.
     4. Edite a variável `Path` e adicione `C:\Java\jdk-21\bin`.
   - No Linux/Mac:
     ```bash
     export JAVA_HOME=/caminho/para/jdk-21
     export PATH=$JAVA_HOME/bin:$PATH
     ```
5. Verifique a instalação:
   ```bash
   java -version
   ```
   O resultado deve mostrar algo como:
   ```
   openjdk version "21" ...
   ```

### Como Instalar o Maven
1. Acesse o site oficial do Maven: [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi).
2. Baixe o arquivo `.zip` ou `.tar.gz` correspondente ao seu sistema operacional.
3. Extraia o arquivo para um diretório, por exemplo: `C:\Maven`.
4. Configure a variável de ambiente `MAVEN_HOME`:
   - No Windows:
     1. Abra o **Painel de Controle** → **Sistema** → **Configurações Avançadas do Sistema**.
     2. Clique em **Variáveis de Ambiente**.
     3. Adicione uma nova variável chamada `MAVEN_HOME` com o valor `C:\Maven`.
     4. Edite a variável `Path` e adicione `C:\Maven\bin`.
   - No Linux/Mac:
     ```bash
     export MAVEN_HOME=/caminho/para/maven
     export PATH=$MAVEN_HOME/bin:$PATH
     ```
5. Verifique a instalação:
   ```bash
   mvn -v
   ```
   O resultado deve mostrar algo como:
   ```
   Apache Maven 3.8.1 ...
   ```

### Como Instalar o Docker
1. Acesse o site oficial do Docker: [https://www.docker.com/products/docker-desktop](https://www.docker.com/products/docker-desktop).
2. Baixe o instalador do Docker Desktop para o seu sistema operacional.
3. Execute o instalador e siga as instruções:
   - Certifique-se de habilitar a opção **"Install required Windows components for WSL 2"** (no Windows).
   - O Docker Desktop requer o **WSL 2** no Windows. Se ainda não estiver configurado, o instalador ajudará a configurá-lo.
4. Após a instalação, abra o Docker Desktop e certifique-se de que ele está em execução.
5. Verifique a instalação no terminal:
   ```bash
   docker -v
   ```
   O resultado deve mostrar algo como:
   ```
   Docker version 24.0.2, build cb74dfc
   ```

### Como Verificar se o Docker Está em Execução
Antes de construir e executar a aplicação, certifique-se de que o Docker está em execução:
1. Abra o terminal e execute:
   ```bash
   docker info
   ```
2. Se o Docker estiver em execução, você verá informações sobre o daemon do Docker.
3. Caso veja um erro como `Cannot connect to the Docker daemon`, certifique-se de que o Docker Desktop está aberto e em execução.

---

## Como Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/kzar1n/api-example.git
   cd api-example
   ```

2. Gere o arquivo JAR da aplicação:
   ```bash
   mvn clean package
   ```

3. Construa a imagem Docker:
   ```bash
   docker build -t hello-world-app .
   ```

4. Execute o container:
   ```bash
   docker run -p 8081:8081 hello-world-app
   ```

5. Acesse o endpoint:
   ```bash
   GET http://localhost:8081/api/v1/greeting/{uuid}
   ```
   Substitua `{uuid}` por um UUID válido, como `123e4567-e89b-12d3-a456-426614174000`.

6. Exemplo de resposta:
   ```json
   {
       "message": "Hello, World! Your UUID is: 123e4567-e89b-12d3-a456-426614174000"
   }
   ```

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
