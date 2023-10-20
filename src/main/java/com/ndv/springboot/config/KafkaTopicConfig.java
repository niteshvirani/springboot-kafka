package com.ndv.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic firstTopicString() {
        return TopicBuilder.name("first_topic_string").build();
    }

    @Bean
    public NewTopic firstTopicJson() {
        return TopicBuilder.name("first_topic_json").build();
    }
}
