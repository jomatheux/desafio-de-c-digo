# Projeto de Resolução de Questões em Java

Este projeto contém a resolução de três questões utilizando a linguagem Java, seguindo boas práticas de código e eficiência. As questões envolvem a sequência de Fibonacci, a contagem de ocorrências da letra "a" em uma string e o cálculo de uma soma em um loop.

## Estrutura do Projeto

As classes estão localizadas na pasta `src` de um projeto Java no IntelliJ IDEA. Cada questão foi implementada em uma classe separada, conforme detalhado abaixo.

### Questão 1: Verificação de Número na Sequência de Fibonacci

**Arquivo:** `FibonacciChecker.java`

Esta classe contém um programa que verifica se um número informado pertence ou não à sequência de Fibonacci. A sequência de Fibonacci começa com os números 0 e 1, e o próximo valor é sempre a soma dos dois valores anteriores.

- O número pode ser informado através de uma entrada via `Scanner`.
- O programa retorna uma mensagem indicando se o número pertence à sequência.

#### Exemplo de Execução:

```bash
Informe um número: 8
O número 8 pertence à sequência de Fibonacci.
```

### Questão 2: Contagem de Ocorrências da Letra 'a' em uma String

**Arquivo:** `LetterCounter.java`

Esta classe verifica a quantidade de vezes que a letra 'a' (maiúscula ou minúscula) aparece em uma string. O usuário pode informar a string através de uma entrada via `Scanner`.

- O programa retorna a quantidade de ocorrências da letra 'a' ou informa se a letra não foi encontrada.

#### Exemplo de Execução:

```bash
Digite uma string: Java é uma linguagem.
A letra 'a' aparece 4 vezes na string.
```

### Questão 3: Cálculo de Soma em Loop

**Arquivo:** `SomaIndefinida.java`

Esta classe resolve um problema em que é calculada a soma dos valores de uma variável `K` em um loop, começando de 1 até o valor de `INDICE = 12`. A cada iteração, o valor de `K` é incrementado, e o valor da soma é acumulado.

- Ao final da execução, o programa imprime o valor final da soma.

#### Resultado:

```bash
O valor de SOMA é: 77
```

### Execução do Projeto

Para executar o projeto no IntelliJ IDEA:

1. Clone o repositório para o seu ambiente local.
2. Importe o projeto como um projeto Java no IntelliJ IDEA.
3. Cada classe pode ser executada individualmente através do método `main`.

#### Clonando o repositório:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

#### Executando no IntelliJ:

1. **Abra o IntelliJ IDEA e importe o projeto.**
2. **Navegue até a pasta `src` e selecione a classe que deseja executar.**
3. **Clique com o botão direito do mouse na classe e selecione "Run".**

### Tecnologias Utilizadas

- **Java 11** ou superior
- **IntelliJ IDEA**

### Autor

Desenvolvido por [João Matheus Magalhães](https://github.com/jomatheux).


