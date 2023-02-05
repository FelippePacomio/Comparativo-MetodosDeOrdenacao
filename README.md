# Programa comparativo entre métodos de ordenação para análise de sua eficiência

## Objetivo
Este programa tem como objetivo realizar um comparativo entre o métodos:
* Ordenação Bolha (Bubble Sort)
* Ordenação por seleção (Selection Sort)
* Ordenação por inserção (Insertion Sort)
Retornar o tempo de processamento, total de passos e o total de trocas necessárias para o ordenamento dos dados.

## Requisitos

IDE utilizada:
* [Apache NetBeans IDE 14](https://netbeans.apache.org/)

## Funcionamento
 
Ao clicar em 'RUN' é exibido um menu de opções, onde há:
* Opção 1 - Pequeno volume de dados: ao selecionar essa opção, os dados são inseridos manualmente e são guardados dentro de um vetor de tamanho 'x' escolhido pelo usuário. Nesse caso, um vetor pequeno foi considerado como sendo um vetor de tamanho < 1000.

* Opção 2 - Médio volume de dados: ao selecionar essa opção, os dados são inseridos aleatoriamente através da utilização da biblioteca 'Random' e são guardados dentro de um vetor de tamanho '1000'. Nesse caso, um vetor médio foi considerado como sendo um vetor de tamanho = 1000.

* Opção 3 - Grande volume de dados: ao selecionar essa opção, os dados são inseridos aleatoriamente através da utilização da biblioteca 'Random' e são guardados dentro de um vetor de tamanho '10000'. Nesse caso, um vetor grande foi considerado como sendo um vetor de tamanho = 10000.

* Opção 4 - Sair: finaliza a execução do programa.

![MENU](https://user-images.githubusercontent.com/105086121/216851629-b1554214-d28e-4db4-8430-7b3f1f446805.png)

O usuário informa o tamanho do vetor na opção 1:

![MENU2](https://user-images.githubusercontent.com/105086121/216851714-823e0a67-9dbe-4513-bfcd-bdf0daa6bfa1.png)

Informa os dados do vetor e seleciona o método de ordenação:

![MENU3](https://user-images.githubusercontent.com/105086121/216851878-f26b338e-571a-4815-8978-ac26be05605e.png)

Por fim, é informado o tempo de processamento para a ordenação dos valores contidos nos vetores, o total de passos e o total de trocas necessários para sua ordenação, com o propósito de analisar qual o mais eficiente dentre os métodos comparativos para cada caso.

![MENU4](https://user-images.githubusercontent.com/105086121/216852012-4113b58f-b8de-4d7d-b8ba-fa4df5c6814d.png)

Exemplo para o médio volume de dados:

![MENU5](https://user-images.githubusercontent.com/105086121/216852098-2c7cd3dd-9369-4016-9400-abc126673cd0.png)

Exemplo para o grande volume de dados:

![MENU6](https://user-images.githubusercontent.com/105086121/216852100-883852b9-e0d1-46bb-bc9b-20e1c47b802a.png)
