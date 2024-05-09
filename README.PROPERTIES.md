# Configurações do circuito de fallback - Propriedades

Endpoint para permitir a consulta do status do nosso Circuit Breaker
> management.endpoint.health.show-details=always

O que nossa API irá expor
> management.endpoints.web.exposure.include=health, prometheus

Habilitando o Circuit Breaker no health
> management.health.circuitbreakers.enabled=true

COUNT_BASED = Quantidade de requisições
TIME_BASED = Tempo de requisição
> resilience4j.circuitbreaker.instances.address.slidingWindowType=COUNT_BASED

Incluir o circuit no health
> resilience4j.circuitbreaker.instances.address.registerHealthIndicator=true

Das 5 requisições, de +50% for negativa, o circuito vai abrir
> resilience4j.circuitbreaker.instances.address.failureRateThreshold=50

Vão ser efetuadas 5 requisições
> resilience4j.circuitbreaker.instances.address.minimumNumberOfCalls=5

Tempo que o circuito se mantém aberto
> resilience4j.circuitbreaker.instances.address.waitDurationInOpenState=60s

Após os 60s, transferimos para HalfOpen
> resilience4j.circuitbreaker.instances.address.automaticTransitionFromOpenToHalfOpenEnabled=true

Quando estiver no HalfOpen, permitimos 3 requisições. Ele verifica os 50% das 3 e decide se vai para Open ou Closed
> resilience4j.circuitbreaker.instances.address.permittedNumberOfCallsInHalfOpenState=3