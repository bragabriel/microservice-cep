# Microserviço - CEP

Este microserviço faz parte de um [projeto pessoal de estudos](https://github.com/bragabriel/project-sendgift) para aplicar conceitos e ferramentas de nível intermediário-avançado no desenvolvimento de APIs e microserviços.

## Sobre
Este microserviço foi desenvolvido para retornar um endereço completo a partir de um **CEP**, utilizando tecnologias modernas e práticas avançadas de observabilidade e resiliência. Abaixo estão os principais destaques:

- **Consulta a APIs Externas**: Utilização do **Open Feign (Spring)** para realizar chamadas a serviços externos de forma declarativa, facilitando a integração com outras APIs.
- **Arquitetura Hexagonal**: Implementação da Arquitetura Hexagonal, que promove a separação de responsabilidades e facilita a escalabilidade e testabilidade do serviço.
- **Práticas de Resiliência**: Utilização do **Resilience4j** para implementar um **Circuit Breaker**, garantindo que o serviço seja resiliente a falhas em serviços externos e evitando sobrecarga em caso de falhas repetidas.
- **Fallback**: Implementação de mecanismos de fallback para fornecer respostas alternativas em caso de falha e retry para tentar novamente operações que falharem, aumentando a robustez do sistema.

## Tecnologias Utilizadas
No desenvolvimento deste projeto, foram utilizadas as seguintes tecnologias:

- **Java 21**: Linguagem de programação utilizada para desenvolvimento do microserviço.
- **Spring 3.2**: Framework que oferece suporte para a criação de aplicações Java robustas.
- **Open Feign**: Cliente HTTP declarativo que simplifica a integração com APIs externas.
- **Resilience4j**: Biblioteca para implementação de padrões de resiliência, como Circuit Breaker.
- **Spring Actuator**: Ferramenta para monitoramento e gerenciamento da aplicação.
- **Micrometer**: Facade para coleta de métricas de aplicação.
- **Prometheus**: Sistema de monitoramento e alerta para métricas.
- **Grafana**: Plataforma de observabilidade para visualização de métricas e logs.

## Observabilidade e Resiliência

### Observabilidade
A observabilidade é crucial para monitorar a saúde e o desempenho do microserviço. Neste projeto, utilizamos:

- **Spring Actuator**: Proporciona endpoints prontos para monitoramento e gerenciamento da aplicação.
- **Micrometer**: Integração com Prometheus para coletar métricas detalhadas.
- **Prometheus**: Coleta e armazena métricas para análise.
- **Grafana**: Visualiza as métricas coletadas, permitindo a criação de dashboards personalizados.


<div align="center">

<img src="https://github.com/bragabriel/microservice-cep/blob/main/doc/imgs/grafana.png" width="700px">

</div>


### Circuit Breaker e Práticas de Resiliência
Para aumentar a resiliência do microserviço, foram implementadas as seguintes práticas:

- **Circuit Breaker com Resilience4j**: Protege o sistema contra falhas em serviços dependentes, impedindo chamadas repetidas a serviços que estão com falhas.

<div align="center">
    
Circuito Fechado

<img src="https://github.com/bragabriel/microservice-cep/blob/main/doc/imgs/closedCircuit.png" width="650px">

</div>

<br>
<div align="center">

Circuito Aberto

<img src="https://github.com/bragabriel/microservice-cep/blob/main/doc/imgs/openCircuit.png" width="650px">

</div>

- **Fallback**: Proporciona respostas alternativas em caso de falha de serviços dependentes.
- **Retry**: Tentativas automáticas de reexecutar operações falhas, com um intervalo configurável entre as tentativas.

Estas práticas garantem que o microserviço seja capaz de lidar com falhas de forma robusta, mantendo a disponibilidade e a integridade do sistema.

## Como Executar
Para executar o microserviço, siga os passos abaixo:

1. Clone o repositório:
   ```sh
   git clone https://github.com/bragabriel/microservice-cep.git

2. Navegue até o diretório do projeto:
   ```sh
   cd microservice-cep

3. Crie os containers Docker:
   ```sh
   docker-compose up -d
   
## Acessos:

- **Aplicação:** <u>localhost:8081</u>
- **CEP-Api:**
  - (Consulta bem-sucedida): <u>localhost:8081/api/address/**{CEP}**</u>
  - (Forçando a falha para testes): <u>localhost:8081/api/address/**0**</u>
- **Spring Actuator:** <u>localhost:8081/actuator</u>
- **Prometheus:** <u>localhost:9090</u>
- **Grafana:** <u>localhost:3000</u>

Para visualizar as métricas coletadas, você pode configurar o Prometheus e Grafana conforme a documentação oficial dessas ferramentas, utilizando o dashboard de sua preferência 😃
