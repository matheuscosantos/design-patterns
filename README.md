# Factory Method

O **Factory Method** é um dos padrões de projeto criacionais mais conhecidos e amplamente utilizados. 
Ele fornece uma interface para criar objetos em uma superclasse, 
mas permite que as subclasses alterem o tipo de objetos que serão criados. 
Abaixo estão as vantagens e desvantagens desse padrão:

### Vantagens

. **Desacoplamento**:
- O Factory Method promove o **princípio de responsabilidade única** e o **princípio aberto/fechado**. 
- Ele permite que o código que cria objetos seja separado do código que usa esses objetos, 
- facilitando a manutenção e a evolução do sistema.

. **Facilidade de Extensão**:
- Novos tipos podem ser adicionados sem modificar o código existente. 
- Basta criar uma nova subclasse que implemente o método de fábrica para criar o novo tipo.

. **Controle sobre a Instanciação**:
- O Factory Method permite que as subclasses controlem o processo de criação de objetos, 
- o que pode ser útil quando a criação de um objeto envolve lógica complexa ou quando diferentes
- tipos de objetos precisam ser criados em diferentes contextos.

. **Redução de Código Duplicado**:
- O padrão ajuda a evitar a duplicação de código de criação de objetos em várias partes do sistema, 
- centralizando a lógica de criação em um único lugar.

. **Flexibilidade**:
- O Factory Method permite que o código cliente trabalhe com interfaces ou classes abstratas, 
- sem precisar conhecer as classes concretas que estão sendo instanciadas. 
- Isso torna o código mais flexível e fácil de modificar.

### Desvantagens

. **Complexidade Adicional**:
- O uso do Factory Method pode aumentar a complexidade do código, 
- especialmente em sistemas simples onde a criação de objetos não é um problema. 
- A introdução de classes e métodos adicionais pode tornar o código mais difícil de entender e manter.

. **Muitas Subclasses**:
- Para cada novo tipo de produto, é necessário criar uma nova subclasse que implemente o método de fábrica. 
- Isso pode levar a um grande número de subclasses, o que pode ser difícil de gerenciar em sistemas grandes.

. **Dificuldade de Depuração**:
- Como o Factory Method oculta a criação de objetos, pode ser mais difícil rastrear a origem de um objeto específico
- durante a depuração, especialmente em sistemas complexos.

. **Sobrecarga de Herança**:
- O Factory Method depende fortemente de herança, o que pode ser uma desvantagem em linguagens que não suportam
- bem a herança múltipla ou quando o uso excessivo de herança pode levar a uma hierarquia de classes muito profunda
- e difícil de gerenciar.

### Conclusão

O **Factory Method** é uma excelente escolha quando você precisa de flexibilidade na criação de objetos
e deseja seguir os princípios de design orientado a objetos, como o **princípio aberto/fechado**. 
No entanto, ele pode adicionar complexidade desnecessária em sistemas simples e pode resultar 
em uma proliferação de subclasses.