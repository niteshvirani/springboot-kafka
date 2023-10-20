package com.ndv.springboot.kafka;

import com.ndv.springboot.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "first_topic_json", groupId = "firstGroup")
    public void consume(User user) {
        LOGGER.info(String.format("Json message received -> %s", user));
    }
}
