package com.dugu.rabbitmqproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.support.MessageBuilder;

import java.util.concurrent.CompletableFuture;

@EnableBinding(Iproducer.class)
public class Producer
{
    @Autowired
    Iproducer iproducer;

    @Output
    public void sendMessage(String info) throws Exception {
        CompletableFuture.runAsync(() ->
        {
            try {
                iproducer.SysMQoutput().send(MessageBuilder.withPayload(info).build());
                System.out.println("send success!");
            } catch (Exception e) {
                System.out.println("send failed!");
                System.out.println(e.getMessage());
            }

        });
    }

}
