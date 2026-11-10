# Design Patterns em Java

Este repositório contém a implementação de três padrões de projeto (Design Patterns) em Java, desenvolvidos para a atividade da disciplina de Arquitetura de Software.

## 1. Prototype — Padrão Criacional

Implementa um sistema de personagens em que um personagem base é clonado para criar novos personagens.

Foram criados três clones: Arthur, Merlin e Lancelot, mantendo os atributos originais e alterando apenas os nomes.

## 2. Adapter — Padrão Estrutural

Implementa um adaptador que permite utilizar uma biblioteca antiga de logs por meio de uma nova interface.

A interface `Logger` possui os métodos `info()` e `error()`, que são adaptados para o método `log()` da classe `LegacyLogger`.

## 3. Strategy — Padrão Comportamental

Implementa um carrinho de compras que permite utilizar diferentes estratégias de desconto:

- Sem desconto
- Desconto percentual de 10%
- Desconto fixo de 20

O padrão permite alterar a estratégia durante a execução do programa.

## Tecnologias utilizadas

- Java
- Visual Studio Code
- Git e GitHub

## Como executar

Entre na pasta do padrão desejado pelo terminal, compile os arquivos Java e execute a classe principal.

Exemplo para o Strategy:

```bash
cd strategy
javac *.java
java Main
```

Para os demais padrões, utilize o mesmo procedimento nas pastas `prototype` e `adapter`.

## Organização

Cada padrão está separado em sua própria pasta, contendo as classes e interfaces necessárias para seu funcionamento.