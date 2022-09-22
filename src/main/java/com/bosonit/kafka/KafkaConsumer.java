package com.bosonit.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaConsumer {

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }

    @KafkaListener(id = "myId", topics = "mytopic_1")
    public void listen(String in) {
        System.out.println(in);
    }

}
