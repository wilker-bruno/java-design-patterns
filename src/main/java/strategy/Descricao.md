## Problema
Suponha que você é um analista de dados e está participando de um projeto que irá analisar dados de diversas empresas 
com o objetivo de detectar padrões nesses dados. Porém, cada empresa adota uma nomenclatura, uma organização e 
um tipo de arquivo (csv, xls, xlsx, txt...) para os relatórios. 

Como importar os relatórios de diferentes tipos, converter as várias nomenclaturas e organizações para uma entidade modelo?  

## Solução
Combinar o design pattern Strategy, Factory e criar uma interface que mapeia o layout importado para a entidade comum.

1. Criar a entidade modelo (Pedido)
2. Criar uma interface (MapearParaPedido) com um método que tem como retorno a entidade modelo
3. Criar uma classe que representa o layout importado e fazer ela implementar a interface MapearParaPedido
4. Criar uma interface (LerLayoutStrategy) com um método que tem como retorno uma lista de objetos que implementam MapearParaPedido
5. Criar a implementação concreta de LerLayoutStrategy para cada layout importado

## Prós e Contras
Com o strategy podemos abstrair a forma com que determinado objeto executa uma ação, ao mesmo tempo que deixamos o código 
adaptado para novas implementações (ler txt, ler tsv) e podemos alterar os comportamentos ao trocarmos as implementações,
mas por outro lado, o número de classes e interfaces aumentam. Aplicar tal padrão para um conjunto pequeno de comportamentos que não 
tem previsão de crescer criaria complexidade desnecessária.

## Referências
- [Refactoring Guru](https://refactoring.guru/pt-br/design-patterns/strategy)
- [Otávio Miranda (Youtube)](https://youtu.be/mUagTgSnriQ)