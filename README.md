<html>
  <h1>Algoritmo Genético</h1>
  <p>A implementação do código Algoritmo Genético baseou-se no artigo "Uma abordagem para predicão de estudantes em risco
  utilizando algoritmos genéticos e mineração de dados: um estudo de caso com dados de um curso técnico a distância.
  Autores: Emanuel Marques Queiroga, Cristian Cechinel, Marilton Sanchonete de Aguiar", e no modelo do Algorimo Genético da Mochila, com algumas
  adaptações para abstrair a representação dos dados.</p> 
  <p>O código foi implementado em Java, no NeatBeans. Basicamente, o software carrega duas bases de dados referentes aos algoritmos árvore de decisão e redes MLP. 
  Os cromossomos ou indivíduos de cada grupo são classificadores com configuração específica, gerados aleatoriamente. Por exemplo, no caso de um cromossomo de
    arvores de decisão podemos ter como configuração o número de níveis ou levels, ou ainda a quantidade de nós e sua acurácia. </p>
   <p>Os cromossomos têm tamanho de 10 posições, onde cada
    posição identifica um classificador de um certo grupo com uma configuração específica, ou seja, se a posição zero estiver preenchida com 1, significa que o primeiro classificador
    representa esse cromossomo e automaticamente, as demais posições são preenchidas com zero. Os cromossomos gerados compõe
  uma população de árvore de decisão e outra de redes MLP. Para a população de árvores de decisão, foi realizada uma amostragem considerando acurácia >= 90%, enquanto
  que para a população de redes MLP foi considerada uma acurácia >= 85%. Logo, os cromossomos de cada população recebiam da avaliação nota zero, caso não atende-se ao critério acima e   
  caso atende-se recebiam como nota o valor da própria acurácia. Os cromossomos selecionados passaram a compor uma amostra de cada grupo, fundamental para as
  próximas etapas abordadas pelo artigo como reprodução e mutação. Todavia, é importante ressaltar que o objetivo do software foi apenas representar os dados da proposta do artigo     mencionado em alguma linguagem, 
    de modo a exemplificar seu funcionamento. Veja a ilustração do resultado: </p> 
    <img src="https://github.com/sanderpiva/algoritmo_genetico/blob/main/1.png" alt="Foto 1">
    <img src="https://github.com/sanderpiva/algoritmo_genetico/blob/main/2.png" alt="Foto 2">
    <img src="https://github.com/sanderpiva/algoritmo_genetico/blob/main/3.png" alt="Foto 3">
    <img src="https://github.com/sanderpiva/algoritmo_genetico/blob/main/4.png" alt="Foto 4">
    
</html>
