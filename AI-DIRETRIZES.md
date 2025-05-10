# Liguaguem e frameworks
- Utilize a linguagem Java 21.
- Utilize maven como gerenciador de dependencias.
- Utilize o framework Spring Boot.

# Metodologias e boas práticas
- Utilize BDD na codificação, documentação e testes.
- Siga os sempre os principios definidos pelos Twelve factors.
- Leve em consideração todos os design patterns e, caso haja algum cenário onde é possivel aplica-lo, de a sugestão explicando as vantagens e desvantagens de utilizar esse pattern.

# Depencias e estrutura
- Utilize sempre o parent spring-boot-starter-parent. 
- Siga sempre o modelo arquitetural Clean Architecture.
- Todas as dependencias definidas, devem possuir a especificação da versao utilizada.

# Logging
- Utilize a biblioteca SLF4J.
- Evite Informações Sensíveis
- Adote um Formato Estruturado. 
    Exemplo de log em JSON:
    {
        "timestamp": "2025-05-10T12:00:00Z",
        "level": "INFO",
        "message": "Usuário autenticado com sucesso",
        "payload": 12345
    }
# Documentação
- Sempre crie ou atualize o arquivo README.md

