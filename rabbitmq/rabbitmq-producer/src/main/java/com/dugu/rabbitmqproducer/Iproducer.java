package com.dugu.rabbitmqproducer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface Iproducer
{
    //定义生产者通道名称
    String SYS_LOG_OUTPUT = "zipkinoutput";

    @Output(SYS_LOG_OUTPUT)
    MessageChannel SysMQoutput();
}
