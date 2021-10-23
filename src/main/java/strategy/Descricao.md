## Problema
Ler, mapear para uma entidade comum e importar arquivos com layouts diversos. 
Suponha que você é um analista de dados e está participando de um projeto que irá analisar dados de diversas empresas 
com o objetivo de detectar padrões nesses dados. Porém, cada empresa adota uma nomenclatura, uma organização e 
um tipo de arquivo (csv, xls, xlsx, txt...) para os relatórios. 

Como importar os relatórios de diferentes tipos, converter as várias nomenclaturas e organizações para uma entidade comum?  

## Solução
Combinar o design pattern Strategy, Factory e criar uma interface que mapeia o layout importado para a entidade comum.

1. Criar a entidade comum (Entity)
2. Criar uma interface (MapperToEntity) com um método que tem como retorno a entidade comum
3. Criar uma classe que representa o layout importado e implementar MapperToEntity nela
4. Criar uma interface (LerLayoutStrategy) com um método que tem como retorno uma lista de objetos que implementam MapperToEntity
5. Criar a implementação concreta de LerLayoutStrategy para o layout importado

## Referências