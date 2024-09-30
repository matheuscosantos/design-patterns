# Padrão de Projeto Builder

O **Builder** é um dos padrões de projeto (design patterns) criacionais definidos pela **Gang of Four (GoF)**. 
Ele é utilizado para construir objetos complexos de forma controlada e passo a passo, 
permitindo que o mesmo processo de construção possa criar diferentes representações de um objeto. 
O Builder é especialmente útil quando a criação de um objeto envolve muitos parâmetros opcionais ou 
quando o processo de construção é complexo.

## Estrutura do Padrão Builder

O padrão Builder geralmente envolve os seguintes componentes:

. **Builder**: Interface ou classe abstrata que define os métodos para construir as partes do objeto.

. **ConcreteBuilder**: Implementação concreta da interface Builder, que constrói e monta as partes do produto.

. **Product**: O objeto complexo que está sendo construído.

. **Director** (opcional): Uma classe que controla o processo de construção, 
chamando os métodos do Builder em uma ordem específica.

## Vantagens do Padrão Builder

. **Facilita a criação de objetos complexos**: O Builder permite a criação de objetos complexos de 
forma controlada e passo a passo, sem a necessidade de passar muitos parâmetros no construtor.

. **Código mais legível**: O uso de métodos encadeados (chaining) torna o código mais legível e fácil de entender, 
especialmente quando há muitos parâmetros opcionais.

. **Imutabilidade**: O Builder pode ser usado para criar objetos imutáveis, já que o objeto final é 
construído apenas uma vez e não pode ser modificado posteriormente.

. **Flexibilidade**: O mesmo processo de construção pode ser reutilizado para criar diferentes 
representações de um objeto, dependendo dos parâmetros fornecidos.

. **Separação de responsabilidades**: O Builder separa a lógica de construção do objeto da lógica
de negócio do objeto em si, tornando o código mais modular e fácil de manter.

## Desvantagens do Padrão Builder

. **Complexidade adicional**: O padrão Builder pode adicionar complexidade desnecessária ao código, 
especialmente se o objeto a ser construído não for tão complexo ou se houver poucas variações no processo de construção.

. **Mais classes**: O uso do Builder geralmente requer a criação de várias classes ou interfaces adicionais, 
o que pode aumentar o número de arquivos e a complexidade do projeto.

. **Overhead de memória**: Dependendo da implementação, o Builder pode consumir mais memória, 
já que ele mantém uma cópia de todos os atributos antes de construir o objeto final.

. **Não é necessário para objetos simples**: Para objetos simples com poucos parâmetros, o uso de um
Builder pode ser um exagero, e um simples construtor pode ser mais eficiente.

## Quando Usar o Padrão Builder?

- Quando a criação de um objeto envolve muitos parâmetros opcionais ou valores padrão.
- Quando o processo de construção de um objeto é complexo e envolve várias etapas.
- Quando você deseja criar diferentes representações de um objeto usando o mesmo processo de construção.
- Quando você deseja tornar o código de criação de objetos mais legível e modular.

## Conclusão

O padrão **Builder** é uma excelente escolha para a criação de objetos complexos, especialmente quando há muitos
parâmetros opcionais ou quando o processo de construção é complicado. No entanto, ele pode adicionar 
complexidade desnecessária em casos onde o objeto é simples ou onde um construtor tradicional seria suficiente.