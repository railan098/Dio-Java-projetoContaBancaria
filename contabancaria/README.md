# ContaBancaria

Projeto de exemplo em Java que demonstra entrada de dados no terminal para informações básicas de conta bancária.

## Descrição

Este repositório contém uma aplicação simples em Java chamada `ContaTerminal` que solicita o nome e o CPF do usuário e exibe uma mensagem com o saldo. É um projeto didático para praticar entrada/saída no console e compilação básica em Java.

## Requisitos

- Java JDK instalado (recomendado Java 11 ou superior).
- Variáveis de ambiente `JAVA_HOME` e `PATH` configuradas para usar `javac` e `java` no terminal.

## Como compilar e executar (Windows - PowerShell)

1. Abra um PowerShell na raiz do projeto (onde estão as pastas `src`, `bin`, `lib`).

2. Compile a aplicação:

```powershell
javac -d bin src\ContaTerminal.java
```

3. Execute a aplicação:

```powershell
java -cp bin ContaTerminal
```

Observações:
- Se preferir usar uma IDE (Eclipse, IntelliJ ou VS Code), importe o projeto como um projeto Java e execute a classe `ContaTerminal`.

## Estrutura do projeto

- `src/` - código-fonte Java (contém `ContaTerminal.java`).
- `bin/` - saída de compilação (arquivos `.class`) — gerada após compilar.
- `lib/` - dependências externas (se houver).
- `README.md` - este arquivo.

## Sobre a classe principal

Arquivo: `src/ContaTerminal.java`

Classe `ContaTerminal` contém o método `main` e utiliza `Scanner` para leitura de entrada do usuário. A aplicação demonstra leitura de um nome, um CPF (como `long`) e exibe um saldo fixo.

## Possíveis melhorias

- Ler o nome completo corretamente usando `scanner.nextLine()`.
- Validar o formato do CPF.
- Permitir operações de depósito/saque e persistir dados.

## Contribuição

Pull requests são bem-vindos. Para contribuições:

1. Faça um fork do repositório.
2. Crie uma branch para sua feature: `git checkout -b feature/nome-da-feature`.
3. Faça commits claros e envie o pull request.

## Licença

Este projeto não possui uma licença especificada. Se deseja adicionar uma licença, considere adicionar um arquivo `LICENSE` (por exemplo, `MIT`) e mencionar aqui.
