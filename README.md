# springboot-jpa

Projeto web services com Spring Boot e JPA / Hibernate.
 
Objetivos:

- Criar projeto Spring Boot Java.
- Implementar modelo de domínio.
- Estruturar camadas lógicas: resource, service, repository.
- Configurar banco de dados de teste (H2).
- Povoar o banco de dados.
- CRUD - Create, Retrieve, Update, Delete.
- Tratamento de exceções.

Foi utilizado Spring Boot, Maven, h2, Postgre, e postman para consultar e testar as requisições criadas...

Aplicação está no heroku, com o postman, consegue acessar com a URL:
https://practice-javasb.herokuapp.com/

get users: https://practice-javasb.herokuapp.com/users
post users para criar novo usuario: passando um json contendo, name, email, password, phone: https://practice-javasb.herokuapp.com/users 
get user por id: https://practice-javasb.herokuapp.com/users/1
delete por id:  https://practice-javasb.herokuapp.com/users/1
put por id:  https://practice-javasb.herokuapp.com/users/1
