# microservice-architecture

Это учебный проект в рамках курса про микросервисную архитектуру.

Архитектура проекта выглядит следующим образом:

<p align="center">
  <kbd>
    <img src="https://github.com/DmitryKotx/microservice_architecture/assets/109358996/e82f036d-973d-43ac-a11c-72e4da04be2a"/>
  </kbd>
</p>

Есть возможность запуска из среды разработки, также можно запускать микросервисы, используя docker.
Частично реализована работа приложения с помощью kubernetes: сервисы postgres и rabbitmq запускаются и выполняют свои задачи, 
однако zipkin не дает никакой полезной информации. Возможно, что имеется проблема с зависимостями.

В будущем планируется полностью перенести микросервисы на kubernetes.

### Стек:

backend: Java, Spring Boot, Spring Data, Spring Cloud, Docker, RabbitMQ, Lombok
database: PostgreSQL  
IDE: IntelliJ IDEA
build system: Maven  
