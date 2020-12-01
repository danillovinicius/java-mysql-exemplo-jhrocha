# Programa Java Conectando o Banco de Dados Mysql.

## Necessário:
Java 11
MySQL 5.7
MySQL JDBC driver mysql-connector-java:8.0.22

## Banco de Dados
````sql
-- Criar o Schema
CREATE DATABASE PESSOADATABASE;

-- Criar a tabela pessoa
CREATE TABLE PESSOA (
    ID INT NOT NULL AUTO_INCREMENT,
    NOME VARCHAR(100) NOT NULL,
    IDADE INT NOT NULL,
    PRIMARY KEY (ID)
);

-- Inserir um registro
INSERT INTO PESSOA(NOME, IDADE) VALUES ('João Hugo Rocha', 35);
````

## Configuração de conexão com o banco Mysql

````java 
// Configurar as propriedades abaixo no arquivo Main.java de acordo com a configuração local.
String NOME_BANCO = "PESSOADATABASE";   // Nome do DATABASE criado
String USUARIO = "root";                // Usuário do Mysql
String SENHA = "root";                  // Senha do Mysql
````

## Compilar o programa:

````shell
## Acessar o diretório onde o arquivo Main.java se encontra.
javac Main.java
````

## Executar o programa:

````shell
## Acessar o diretório onde o arquivo Main.class foi gerado no comando anterior.
java -classpath lib/*:. Main
````

