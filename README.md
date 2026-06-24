# Banco de Pessoas 

Esse projeto implementa um sistema de gerenciamento de banco de dados em memória operado  via Interface de Linha de Comando (CLI). Ele foi desenvolvido como exercício prático para a disciplina de Projetos Orientados a Objeto. 

## Sobre o Projeto

O objetivo principal desta aplicação é permitir a inserção, busca, exclusão e listagem de registros de pessoas utilizando comandos diretos no terminal. 

## Arquitetura e Padrões de Projeto

Para evitar o uso de múltiplos blocos estruturais if/else na interpretação dos argumentos do terminal, o projeto foi arquitetado utilizando o **Command Pattern**. 

## Tecnologias Utilizadas
* **Java** 

## Compilação e Execução

### 1. Compilação
Abra o seu terminal, navegue até a pasta raiz do projeto onde estão os arquivos fonte e compile as classes:

```bash
javac BancoPessoas.java Pessoa.java Comando.java