# 🧬 Algoritmo Genético: Predição de Evasão Acadêmica

Este projeto implementa um **Algoritmo Genético (AG)** desenvolvido em Java, fundamentado no estudo de caso *"Uma abordagem para predição de estudantes em risco utilizando algoritmos genéticos e mineração de dados"* (Queiroga et al.). O sistema busca otimizar a seleção de classificadores para identificar precocemente alunos em risco de evasão escolar.

## 🚀 Visão Geral
A solução utiliza a lógica do "Problema da Mochila" adaptada para abstrair e selecionar as melhores configurações de modelos de Machine Learning, focando na eficiência da predição.

### 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java.
* **IDE:** NetBeans.
* **Conceitos:** Algoritmos Genéticos, Heurísticas de Otimização e Mineração de Dados.

---

## 🧠 Funcionamento do Algoritmo

O software processa e evolui duas populações distintas de classificadores para análise comparativa:

1. **Árvores de Decisão (AD):** Analisa configurações como número de níveis (depth), quantidade de nós e acurácia.
2. **Redes Neurais (MLP):** Avalia indivíduos gerados aleatoriamente com configurações específicas de performance.

### Estrutura do Cromossomo
Cada indivíduo (cromossomo) possui 10 posições, utilizando uma representação onde cada posição identifica um classificador específico. Se uma posição é ativada, as demais são zeradas, garantindo a integridade da configuração do indivíduo.

### Critérios de Seleção (Fitness)
A evolução é guiada por critérios rigorosos de acurácia para compor a amostra de reprodução e mutação:
* **População AD:** Exige acurácia mínima de **90%**.
* **População MLP:** Exige acurácia mínima de **85%**.
* Indivíduos que não atingem esses patamares recebem nota zero na avaliação.

---

## 📊 Resultados e Demonstração

O foco da implementação é exemplificar o funcionamento dos algoritmos genéticos aplicados à ciência de dados educacional.

<div align="left">
  <img src="https://github.com/sanderpiva/algoritmo_genetico/blob/main/1.png" width="65%" alt="Resultado 1">
  <img src="https://github.com/sanderpiva/algoritmo_genetico/blob/main/2.png" width="100%" alt="Resultado 2">
  
  <br>
  <img src="https://github.com/sanderpiva/algoritmo_genetico/blob/main/3.png" width="65%" alt="Resultado 3">
  <img src="https://github.com/sanderpiva/algoritmo_genetico/blob/main/4.png" width="100%" alt="Resultado 4">
</div>

---

### 💡 Considerações
Este projeto reflete a aplicação prática da observação de dados: ao invés de apenas coletar informações, o algoritmo seleciona as ferramentas (classificadores) mais precisas para observar o fenômeno de interesse, garantindo que o insight final seja estatisticamente confiável para a tomada de decisão.

---
**Autor:** Sander Gustavo Piva 
