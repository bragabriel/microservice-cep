# Microserviço - CEP 

Este Microserviço faz parte de um [projeto de estudos](https://github.com/bragabriel/microservice-cep) para realizar a utilização de conceitos e ferramentas de nível intermediário-avançado.


## Sobre:
Este Microserviço retorna um Endereço completo a partir de um CEP.<br><br>
 Utilizei <b>Open Feign (Spring)</b> para consultar API's externas, coloquei em prática a <b>Arquitetura Hexagonal</b> para permitir a escalabilidade e testabilidade do serviço. Também implementei  <b>Práticas de Resiliência de API's e Microserviços</b>, com a utilização do <b>Resilience4j</b> para o desenvolvimento de um <b>Circuit-Breaker</b>.


## Tecnologias utilizadas
No desenvolvimento deste projeto, foram utilizadas as seguintes tecnologias:
* Java 21;
* Spring 3.2;
* Open Feign;
* Resilience4j.