# Demonstração de Conversão e Arredondamento de Números em Java

## Descrição

Este programa demonstra a diferença entre converter números de ponto flutuante para inteiros utilizando *casting* e arredondar valores utilizando o método `Math.round()` da linguagem Java.

O exemplo utiliza números positivos e negativos do tipo `double` para mostrar que a conversão para `int` descarta a parte fracionária em direção a zero, enquanto `Math.round()` realiza um arredondamento para o inteiro mais próximo, seguindo suas regras específicas.

## Objetivos

- Compreender a conversão explícita de tipos (*casting*) em Java.
- Diferenciar truncamento e arredondamento.
- Conhecer o comportamento do método `Math.round()`.
- Observar as diferenças entre conversões de números positivos e negativos.
- Entender como o tipo de dado influencia o resultado de uma operação.

## Funcionamento do programa

O programa realiza quatro operações para demonstrar as diferenças entre conversão e arredondamento.

### 1. Conversão de `double` para `int` com número positivo

```java
double a = 9.8;
int x = (int) a;
```

A variável `a` armazena o valor `9.8`. Ao utilizar `(int)`, o programa converte explicitamente o valor de `double` para `int`.

Durante essa conversão, a parte fracionária é descartada. O resultado é `9`, e não `10`.

### 2. Conversão de `double` para `int` com número negativo

```java
double b = -9.8;
int y = (int) b;
```

Nesse caso, o valor `-9.8` é convertido para `int`.

O resultado é `-9`, pois Java descarta a parte fracionária em direção a zero. Isso significa que o resultado não é arredondado para o inteiro mais próximo.

### 3. Arredondamento de número positivo

```java
Math.round(a)
```

O método `Math.round()` arredonda o valor de ponto flutuante para o inteiro mais próximo.

Como `9.8` está mais próximo de `10`, o resultado é `10`.

No caso de um valor exatamente no meio entre dois inteiros, como `9.5`, o método arredonda para o inteiro superior, resultando em `10`.

### 4. Arredondamento de número negativo

```java
Math.round(b)
```

O método recebe o valor `-9.8`.

Como o inteiro mais próximo é `-10`, o resultado é `-10`.

Para valores exatamente no meio entre dois inteiros, como `-9.5`, `Math.round()` retorna `-9`, pois sua regra equivale a calcular o piso de \(x + 0{,}5\).

## Código-fonte

O arquivo `Principal.java` contém a implementação completa do programa.

## Como executar

É necessário ter o Java Development Kit (JDK) instalado.

**1. Compile o programa:**

```bash
javac Principal.java
```

**2. Execute o programa:**

```bash
java Principal
```

## Saída esperada

```text
9.8 convertido para int: 9
-9.8 convertido para int: -9
Math.round(9.8): 10
Math.round(-9.8): -10
```

## Conceitos fundamentais

### Conversão explícita de tipos (*casting*)

O *casting* permite converter um valor de um tipo para outro. No exemplo, a expressão `(int)` converte um valor `double` em um inteiro.

Quando essa conversão é realizada de `double` para `int`, a parte fracionária é descartada em direção a zero.

Exemplos:

| Valor original | Conversão para `int` |
|---:|---:|
| `9.8` | `9` |
| `9.2` | `9` |
| `-9.8` | `-9` |
| `-9.2` | `-9` |

### Método `Math.round()`

O método `Math.round()` realiza o arredondamento de acordo com uma regra definida pela API do Java.

Para um argumento do tipo `double`, o método retorna um `long`. Para um argumento do tipo `float`, retorna um `int`.

Exemplos:

| Valor original | Resultado de `Math.round()` |
|---:|---:|
| `9.8` | `10` |
| `9.2` | `9` |
| `-9.8` | `-10` |
| `-9.2` | `-9` |
| `9.5` | `10` |
| `-9.5` | `-9` |

### Diferença entre truncamento e arredondamento

O truncamento descarta a parte fracionária em direção a zero. O arredondamento considera a proximidade entre o valor original e os números inteiros, seguindo a regra do método utilizado.

Essa diferença é especialmente importante em cálculos financeiros, científicos e estatísticos, nos quais a escolha da operação pode influenciar o resultado final.

## Comparação dos resultados

| Operação | Resultado | Comportamento |
|---|---:|---|
| `(int) 9.8` | `9` | Descarta a parte fracionária |
| `(int) -9.8` | `-9` | Descarta a parte fracionária em direção a zero |
| `Math.round(9.8)` | `10` | Arredonda para o inteiro mais próximo |
| `Math.round(-9.8)` | `-10` | Arredonda para o inteiro mais próximo |

## Conclusão

O programa demonstra que converter um número de ponto flutuante para inteiro não é a mesma coisa que arredondá-lo.

O *casting* para `int` descarta a parte fracionária em direção a zero, enquanto `Math.round()` aplica uma regra de arredondamento para obter um inteiro próximo do valor original.

Compreender essa diferença ajuda a evitar erros em cálculos e permite escolher a operação mais adequada conforme a necessidade do programa.