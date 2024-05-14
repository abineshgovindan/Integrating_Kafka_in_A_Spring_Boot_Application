package com.kafka_test.demo.Controller;

import com.kafka_test.demo.Service.KafkaMessagePublisher;
import com.kafka_test.demo.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer-app")
public class EventController {
    @Autowired
    private KafkaMessagePublisher publisher;


//    @GetMapping("/publish/{message}")
//    public ResponseEntity<?> publishMessage(@PathVariable String message){
//        try{
//            for(int i=0; i<= 5; i++) {
//                publisher.sendMessageToTopic(message +" : " + i);
//            }
//            return ResponseEntity.ok("Message published successfully ..");
//        }catch (Exception ex){
//            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }

    @PostMapping("/publishCustomer")
    public ResponseEntity<?> sendEvents(@RequestBody Customer customer){
        try{
            System.out.println("-------------------"+ customer.toString());
            publisher.sendEventToTopic(customer);
            return ResponseEntity.ok("Message published successfully ..");
        }catch (Exception ex){
            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }



    }


}
