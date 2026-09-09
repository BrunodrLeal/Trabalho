Modelar pessoas, funcionários e clientes, aplicando regras de validação e organizando o código para que novas funcionalidades possam ser incluídas sem duplicar informações.

## Estrutura de classes

```text
Pessoa
├── Funcionario (abstrata)
│   ├── Gerente
│   ├── Vendedor
│   └── Desenvolvedor
└── Cliente
```

### Pessoa

`Pessoa` é a classe base, com dados compartilhados por funcionários e clientes:

- `id`
- `nome`
- `cpf`
- `telefone`
- `email`

Os dados são validados nos setters chamados pelo construtor. O telefone é armazenado somente com dígitos e o e-mail deve ter um formato válido.

### Funcionário

`Funcionario` é uma classe abstrata que representa características exclusivas de colaboradores:

- `cargo`
- `salario`
- `dataAdmissao` (`LocalDate`)
- `ativo`

Cada tipo de funcionário implementa `calcularSalario()`, demonstrando polimorfismo:

- `Gerente`: acréscimo de 20% ao salário base.
- `Desenvolvedor`: acréscimo de 10% ao salário base.
- `Vendedor`: salário base acrescido de comissão sobre a meta de vendas.

### Cliente

A classe `Cliente` herda os dados básicos de `Pessoa` e inicia o cadastro de consumidores da loja. Atualmente possui:

- `limiteCredito`
- `pontosFidelidade`

O cadastro de clientes e as opções correspondentes do menu ainda estão em desenvolvimento.

## Funcionalidades atuais

- Cadastro de gerente, desenvolvedor e vendedor.
- Geração sequencial de IDs pela classe `Empresa`.
- Validação de nome, CPF, telefone, e-mail, cargo, salário e data de admissão.
- Busca e remoção de funcionário por ID.
- Listagem de funcionários cadastrados.
- Cálculo da folha salarial usando `calcularSalario()`.
- Tratamento de `IllegalArgumentException` durante o cadastro para informar dados inválidos sem encerrar o programa.

## Classes auxiliares

| Classe | Responsabilidade |
| --- | --- |
| `Empresa` | Possui o método `main`, os menus e as operações sobre funcionários. |
| `DadosBasicos` | Lê nome, CPF, telefone e e-mail pelo `Scanner`. |
| `Dados` | Lê salário, data de admissão e situação de atividade. |
| `CadastroGerente` | Lê permissões de contratar e demitir. |
| `CadastroVendedor` | Lê meta de vendas e percentual de comissão. |
| `CadastroDesenvolvedor` | Lê linguagem e informação de manutenção. |
| `BuscarFuncionario` | Procura um funcionário pelo ID informado. |

## Tecnologias e conceitos praticados

- Java
- Classes, objetos, construtores e encapsulamento
- Herança e classes abstratas
- Polimorfismo e sobrescrita com `@Override`
- Getters, setters e validações
- `ArrayList`
- `Scanner` para entrada de dados
- `switch`, condicionais e laços de repetição
- Exceções com `try`, `catch` e `IllegalArgumentException`
- Datas com `LocalDate` e `DateTimeFormatter`

## Como executar

Com o JDK instalado, execute na pasta raiz do projeto:

```powershell
javac -encoding UTF-8 -d out src\sessao1\*.java
java -cp out sessao1.Empresa
```

## Próximas etapas

1. Finalizar o menu e o cadastro de clientes.
2. Criar busca, listagem e remoção de clientes.
3. Criar a classe `Venda`, relacionando cliente, vendedor, itens e valor total.
4. Criar classes para produto e item de venda.
5. Melhorar a apresentação dos valores monetários e validar as entradas do `Scanner`.
6. Criar testes automatizados para as regras de validação e cálculo salarial.
