package com.Kafka_consumer.Consumer.consumer;

import com.Kafka_consumer.Consumer.dto.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@Slf4j
public class KafkaMessageListener {
    @KafkaListener(topics = "sping-kafka-4", groupId = "sk-group-4")
    public void consume(Customer customer){

        System.out.println("consumer consume the message "+  customer.toString());
        log.info("consumer consume the message {} ", customer.toString());
    }
}

