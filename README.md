# Aplicação Spring Boot de Criação de Salas de Reuniões
Esta aplicação Spring Boot permite que os usuários criem e gerenciem salas de reuniões. 
Com ela, é possível adicionar novas salas, visualizar as salas existentes e excluir salas que não são mais necessárias.

## Tecnologias utilizadas
* Java
* Spring Boot
* H2 Database

## Endpoints
A aplicação possui os seguintes endpoints:

* GET /api/v1/rooms: lista todas as salas existentes.
* GET /api/v1/rooms/{id}: retorna uma sala específica pelo ID.
* POST /api/v1/rooms: adiciona uma nova sala.
* PUT /api/v1/rooms/{id}: atualiza uma sala existente.
* DELETE /api/v1/rooms/{id}: exclui uma sala existente.
