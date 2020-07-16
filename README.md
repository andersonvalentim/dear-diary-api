# Dear Diary API v1.0 
- Link da API: https://dear-diary-api.herokuapp.com/ 
- Link para frontend: https://mydeardiary.netlify.app/ 
- Documentação: https://dear-diary-api.herokuapp.com/swagger-ui.html 
- Repositorio do frontend: https://github.com/cesarionto/dear-diary 

## Características

- A Aplicação foi desenvolvida a partir da arquitetura REST(Roy Fielding).
- Para o teste de requisições foi utilizado o Postman.
- Para a persistencia de dados foi utilizado o SGBD PostgreSQL.
- Para o Mapeamento de Entidades foi utilizado JPA e Hibernate.
- Aplicação desenvolvida com o Springboot e SpringSecurity.
- Utiliza o método de autenticação de usuarios com JWT.
- Para o consumo da API, foi desenvolvido um APP React.
- Aplicação Publicada no HEROKU.

## Para testar em localhost
Clone e Descompacte o arquivo <br/>
- Instale o Postman
- Instale o SGBD PostgreSQL de maneira que o usuario e senha do banco seja postgres.
- Crie um banco de dados local chamado deardiarydb.
- Importe o projeto Maven na IDE e Preferencia. 
- Inicie o Projeto
- Inicie o Postman
- Configure todas as requisições poste para: Headers: Key = Content-Typr e value = Application/json
## Testando as Requisições da API Localmente
- Crie um Novo Usuario POST: https://localhost:8080/sign-up
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
-- O sistema retornara um token JWT, salve em Authorization Bearer Token.
<br/>
- Insira um segredo POST: https://localhost:8080/insert-secret
```json
{
    "subject": "",
    "content" : ""
}
```
- Liste os segredos GET: https://localhost:8080/list-secrets
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

Ps: O processo acima pode ser feito no POSTMAN.
<br/>
