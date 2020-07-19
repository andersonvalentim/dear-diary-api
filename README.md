# Dear Diary API v1.0 

QueridoDiário é um projeto de um diário pessoal com 4 operações principais (VEIA): Visualizar, Excluir, Inserir, Alterar
Adicionalmente, é exposta uma API REST, desenvolvida com outras características (ver a seguir) e com sistema de autenticação.

## Características

- A Aplicação foi desenvolvida a partir da arquitetura REST(Roy Fielding).
- Para a persistência de dados foi utilizado o SGBD PostgreSQL.
- Para o mapeamento de entidades foi utilizado JPA e Hibernate.
- Aplicação desenvolvida com o Springboot e SpringSecurity.
- Utiliza o método de autenticação de usuarios com JWT.
- Para o consumo da API, foi desenvolvido um APP React.
- Aplicação publicada no HEROKU.
- Para o teste de requisições foi utilizado o Postman.

## Como acessar a aplicaçaõ ou consumir a API
- Link para a aplicação: https://mydeardiary.netlify.app/ 
- Link da API: https://dear-diary-api.herokuapp.com/ 
- Documentação: https://dear-diary-api.herokuapp.com/swagger-ui.html 
- Repositório do frontend: https://github.com/cesarionto/dear-diary 

## Para testar em localhost
Clone e Descompacte o arquivo <br/>
- Instale o Postman disponível em: https://www.postman.com/.
- Instale o SGBD PostgreSQL (https://www.postgresql.org/download/) de maneira que o usuario e senha do banco seja postgres.
- Crie um banco de dados local chamado deardiarydb.
- Importe o projeto Maven na IDE e Preferência. 
- Inicie o Projeto.
- Inicie o Postman.
- Configure todas as requisições POST para: Headers: Key = Content-Typr e value = Application/json.

## Testando as Requisições da API em localhost
- Crie um Novo Usuário POST: https://localhost:8080/sign-up
```json
{
    "fullName": "",
    "usarname" : "",
    "password" : ""
}
```
- Logue na API POST: https://localhost:8080/login
```json
{
    "usarname" : "",
    "password" : ""
}
```
-- O sistema retornará um token JWT, salve em Authorization Bearer Token.
<br/>
- Insira um segredo POST: https://localhost:8080/insert-secret
```json
{
    "subject": "",
    "content" : ""
}
```
- Atualize um segredo PUT: https://localhost:8080/update-secret
```json
{
    "id" : 1,
    "subject": "",
    "content" : ""
}
```

- Delete um segredo DELETE: https://localhost:8080/delete-secret/{id}

- Liste os segredos GET: https://localhost:8080/list-secrets


O processo acima também pode ser feito no POSTMAN.
