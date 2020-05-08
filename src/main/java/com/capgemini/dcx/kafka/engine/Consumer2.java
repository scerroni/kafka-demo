package com.capgemini.dcx.kafka.engine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer2 {

    private final Logger logger = LoggerFactory.getLogger(Consumer2.class);

    @KafkaListener(topics = "users", groupId = "group_id_2")
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message 2 -> %s", message));
    }
}
