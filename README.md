# Abstract Factory

O **Abstract Factory** é um padrão de projeto criacional que fornece uma interface para criar famílias de objetos 
relacionados ou dependentes sem especificar suas classes concretas. Ele permite que você crie objetos de várias 
classes relacionadas sem precisar conhecer suas implementações exatas. O padrão é útil quando o sistema precisa
ser independente de como seus objetos são criados, compostos e representados.

Em vez de instanciar diretamente as classes, o Abstract Factory define uma interface para criar objetos, 
e as subclasses concretas implementam essa interface para fornecer as instâncias corretas.

## Estrutura do Abstract Factory

 - AbstractFactory: Interface que declara os métodos para criar os produtos abstratos.
 - ConcreteFactory: Implementa a interface AbstractFactory e cria os produtos concretos.
 - AbstractProduct: Interface para um tipo de produto.
 - ConcreteProduct: Implementa a interface AbstractProduct e define o produto concreto.
 - Client: Usa as fábricas e produtos abstratos, sem se preocupar com as classes concretas.

## Vantagens do Abstract Factory

 - **Desacoplamento**: O padrão promove o desacoplamento entre o código cliente e as classes concretas que ele usa. 
 O cliente não precisa saber quais classes concretas estão sendo instanciadas, 
 apenas que está usando uma interface comum.

 - **Coerência entre produtos**: Garante que os produtos criados por uma fábrica sejam compatíveis entre si. 
 Por exemplo, no exemplo acima, a fábrica WindowsFactory garante que todos os componentes criados 
 (botão e caixa de texto) sigam o estilo do Windows.

 - **Facilidade de substituição**: Se você quiser mudar a família de produtos (por exemplo, de Windows para Mac), 
 basta trocar a fábrica concreta, sem alterar o código do cliente.

 - **Extensibilidade**: É fácil adicionar novas famílias de produtos sem modificar o código existente. 
 Basta criar uma nova fábrica concreta e novos produtos concretos.

## Desvantagens do Abstract Factory

 - **Complexidade**: O padrão pode adicionar complexidade ao código, especialmente se houver muitas famílias de produtos. 
 Isso pode resultar em um grande número de classes e interfaces, tornando o código mais difícil de entender e manter.

 - **Dificuldade de adicionar novos produtos**: Se for necessário adicionar um novo tipo de produto à família 
 (por exemplo, um novo componente gráfico), todas as fábricas concretas e a interface da fábrica abstrata precisarão 
 ser modificadas, o que pode violar o princípio Open/Closed (aberto para extensão, fechado para modificação).

 - **Sobrecarga de manutenção**: Como o padrão envolve muitas classes e interfaces, 
 pode ser mais difícil de manter, especialmente em projetos menores onde o uso de uma fábrica simples seria suficiente.

## Quando usar o Abstract Factory?

- Quando o sistema precisa ser independente de como seus objetos são criados.
- Quando você precisa garantir que os objetos criados por uma fábrica sejam compatíveis entre si.
- Quando o sistema deve ser configurado para trabalhar com diferentes famílias de produtos.