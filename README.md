# API dos Carros (API RESTful com SpringBoot)
<a>https://downloadcursos.top/api-restful-com-springboot/</a>


# Conteúdo Programático

## 📖 Intrudução

- Sobre o curso
- O que é web service
- Instalação Java, Eclipse String Tools e IntelliJ IDEA

## 📖 Criando um Projeto

- Criando um projeto com o String Initializr
- Eclipse Spring Tool Suite
- IntelliJ IDEA
- Arquivo pom.xml
- Classe de Application

## 📖 Resumo das seções 4 a 8

- Introdução Resumo - para desenvolvedores avançados
- Resumo
- O arquivo application.properties

## 📖 Web Services - básico

- Criando o IndexController
- 06-Index
- @RequestMapping
- GET - POST - DELETE - PUT
- GET - @ResquestParam
- POST - @RequestParam

## 📖 API dos Carros

- (Utilizei Sql Server)
- Lista de Carros básicos
- Criando as tabelas no MySQL
- Configurando o MySQLJPA
- @Service - Injeção de dependencia com Spring
- @Id @GeneratedValue (Auto vs Identity)
- Get Carro By Id
- Get Carro By Tipo
- POST - Salva Carro
- PUT - Atualiza Carro
- DELETE - Excluir um Carro

## 📖 HTTP Status Code - Parte 1

- Status Code de retorno do protocolo HTTP
- ResponseEntity
- GET - 404 Not Found
- GET - 204 No Content (CrudRepository)

## 📖 DTO (Data Transfer Object)
 
- O projeto Lombok 
- <a> (https://dicasdejava.com.br/como-configurar-o-lombok-no-eclipse/) </a>
- Lombok no Eclipse
- DTO - Data Transfer Object e JPARepository
- DTO - parte 2 - lambdas
- Model Mapper

## 📖 HTTP Status Code - Parte 2 - POST PUT DELETE
 
- POST - 201 Created - URI location
- PUT
- DELETE

## 📖 Testes com Spring Boot
 
- Testes com Spring Boot
- Teste para Inserir um Carro
- Teste para inserir e Deletar um Carro
- A necessidade de termos um banco de dados para testes
- H2 - banco de dados em memória para testes
- Preenchendo o H2 com uma massa de testes
- Testes HTTP na API

## 📖 Documentação com Swagger
 
- Documentação com Swagger
- pom.xml
- SwaggerConfig.java.txt

## 📖 Tratamento de erros e exceções
 
- ExceptionHandler - parte 1
- ExceptionHandler - parte 2
- ResponseStatus
- ResponseEntityExceptionHandler

## 📖 Segurança
 
- Spring Security
- Customizando a senha de autenticação
- SecurityConfig
- Basic Authentication
- CSRF - Cross-Site Request Forgery
- Memory Authentication e Perfis de acesso (ROLES)
- UserDetails
- UserDetailsService
- Database Authentication - parte 1 - User
- Database Authentication - parte 2 - Roles
- Testes na API de Segurança

## 📖 Deploy
 
- Fazendo o build de um jar
- Deploy no Heroku com GitHub
- Deploy no Heroku Git
- Profiles - prod vs dev


## 📖 Upload de Arquivos
 
- Firebase Storage
- Base64
- Firebase Storage - configurações (parte 1)
- Firebase Storage - configurações (parte 2)
- Firebase Storage - código
- Testes unitários

## 📖 Segurança e Token JWT
 
- CORS
- Introdução ao JWT
- JWT Token na prática
- Preparando o código (parte 1)
- Preparando o código (parte 2) - testes
- Gerando e validando o Token JWT (JWTUtil)
- JWT AuthenticationFilter
- JWT AuthorizationFilter
- UnauthorizedHandler
- AccessDeniedHandler
- Swagger com JWT

## 📖 Users Controller
 
- Exercício - UsersController
- Refactor - sugestão para organizar os pacotes
- UsersController
- Duvida Login - Controller vs Filtro

## 📖 Extra
 
- Paginação - parte 1
- Paginação - parte 2
- SQL com Join
- GraphQL

## 📖 Dúvidas
 
- Erro de Timezone no MySQL
- @JsonInclude - Ignorar atributos nulos ao gerar o JSON