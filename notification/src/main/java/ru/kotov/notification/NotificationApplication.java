package ru.kotov.notification;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.kotov.amqp.RabbitMqMessageProducer;


@SpringBootApplication(
        scanBasePackages = {
            "ru.kotov.notification",
            "ru.kotov.amqp",
})
public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }
//    @Bean
//    CommandLineRunner commandLineRunner(RabbitMqMessageProducer producer, NotificationConfig config) {
//        return args -> {
//            producer.publish(
//                    new Person("Dima", 20),
//                    config.getInternalExchange(),
//                    config.getInternalNotificationRoutingKey()
//            );
//        };
//    }
//     record Person(String name, Integer age){
//
//    }
}