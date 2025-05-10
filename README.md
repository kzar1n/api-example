# Hello World Application

Uma aplicação simples "Hello World" construída com Java 21, Spring Boot e seguindo o modelo Clean Architecture.

## Requisitos
- Java 21
- Maven 3.8+

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

## Como Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/kzar1n/api-example.git
   cd api-example
   ```

2. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

3. Acesse o endpoint:
   ```
   GET http://localhost:8080/api/v1/greeting
   ```

## Estrutura do Projeto

**domain:** Contém as entidades do domínio.  
**application:** Contém os casos de uso.  
**adapters/controllers:** Contém os controladores REST.