package com.Kafka_consumer.Consumer.dto;

import lombok.Data;

@Data
public class Customer {
    private int id;
    private String name;
    private String email;
    private String contactNo;
}
