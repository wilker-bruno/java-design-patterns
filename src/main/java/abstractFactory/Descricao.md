## Problema

Suponha que você esta desenvolvendo uma aplicação que premia com computadores os ganhadores de uma competição. Onde o
segundo colocado ganha um computador gamer de entrada e o primeiro lugar ganha um computador gamer de alto desempenho. A
empresa já deixou claro que futuramente competidores de outras colocações também serão premiados.

Como instanciar computadores de acordo com o tipo e sem ter que ficar passando peça por peça sempre que precisar?

## Solução

Note que independente do tipo de computador eles sempre terão os mesmos componentes, o padrão Abstract Factory vai
abstrair e garantir que criemos os componentes de tipo correto juntos.

Criar uma classe comum aos diferentes tipos e uma fábrica que sabe qual a configuração de cada computador pelo tipo.

1. Criar uma entidade modelo (Computador)
2. Criar uma interface (ComputadorFactory) com um método para cada componente do computador
3. Criar a implementação concreta de ComputadorFactory para cada tipo (entrada e high end)

## Prós e Contras

Com isso podemos isolar a criação dos computadores e quais tipos existem na aplicação, evitando ficar instanciando e
setando os componentes de forma espalhada pelo código. Garante que as partes que compõem o todo sejam da mesma família.
Porém, adicionar um novo tipo de componente exige alteração em todas as implementações. Além de aumentar o número de
classes e interfaces da aplicação.

## Referências

- [Refactoring Guru](https://refactoring.guru/pt-br/design-patterns/strategy)
- [Otávio Miranda (Youtube)](https://youtu.be/mUagTgSnriQ)