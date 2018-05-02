[![Build Status](https://travis-ci.org/dlv/meu-primeiro-projeto.svg?branch=master)](https://travis-ci.org/dlv/meu-primeiro-projeto)

# meu-primeiro-projeto
Projeto inicial Spring Boot

## Configurações do MySQL

1. Criando container
	- sudo docker run -it --name container-curso-springboot -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=flyway -d mysql

2. Acessando o container
	- sudo docker exec -it container-curso-springboot bash