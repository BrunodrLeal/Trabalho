# Sistema de Cadastro de Funcionários — Mattos Calçados

Projeto desenvolvido em **Java** para praticar conceitos de Programação Orientada a Objetos (POO), como encapsulamento, herança, abstração e polimorfismo.

## Ampliação do Projeto

Nesta nova etapa, a classe abstrata `Funcionario` foi ampliada para representar um cadastro mais completo dos colaboradores da empresa.

Foram adicionados os seguintes atributos:

* `id` — identificador único do funcionário.
* `nome` — nome completo.
* `cpf` — documento de identificação.
* `telefone` — telefone para contato.
* `email` — endereço de e-mail.
* `cargo` — função exercida na empresa.
* `salario` — salário do funcionário.
* `dataAdmissao` — data de admissão.
* `ativo` — indica se o funcionário está ativo na empresa.

## Estrutura Atual

A classe `Funcionario` continua sendo uma **classe abstrata**, servindo como base para os diferentes tipos de funcionários do sistema.

As classes especializadas continuam utilizando **herança e sobrescrita de métodos**, permitindo que cada tipo de funcionário possua suas próprias regras de cálculo salarial.

O projeto também utiliza `ArrayList<Funcionario>` para armazenar diferentes tipos de funcionários em uma mesma coleção, reforçando o conceito de **polimorfismo**.

## Conceitos Praticados

* Classes e objetos
* Encapsulamento
* Atributos `private`
* Getters e setters
* Construtores
* Classe abstrata
* Métodos abstratos
* Herança
* Polimorfismo
* Sobrescrita com `@Override`
* `ArrayList`
* Estruturas condicionais
* `switch`
* Laços de repetição
* Entrada de dados com `Scanner`

## Objetivo

O objetivo desta etapa é evoluir o sistema de um cadastro básico de funcionários para uma estrutura mais próxima de um **sistema real de gestão de colaboradores**, aumentando a quantidade de informações armazenadas e preparando o projeto para novas funcionalidades.

## Próximas Etapas

* Implementar validações dos novos atributos.
* Criar e aprimorar os métodos de cadastro, busca, alteração e remoção.
* Controlar funcionários ativos e inativos.
* Melhorar a apresentação dos dados.
* Evoluir as regras de cálculo salarial.
* Continuar aplicando os conceitos de POO no projeto.
