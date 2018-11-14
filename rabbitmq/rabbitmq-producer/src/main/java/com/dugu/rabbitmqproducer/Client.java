package com.dugu.rabbitmqproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client
{
    @Autowired
    Producer producer;

    @RequestMapping("/send")
    public String sendMessageToRabbitmq() {
        try {
            producer.sendMessage("three days to see ");
            return "success";
        } catch (Exception e) {
            return "send failed: " + e.getMessage();
        }

    }
}
