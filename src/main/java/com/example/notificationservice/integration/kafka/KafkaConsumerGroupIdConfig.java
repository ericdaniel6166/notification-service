package com.example.notificationservice.integration.kafka;

import com.example.springbootmicroservicesframework.integration.kafka.config.KafkaConsumerConfig;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;

@Configuration
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class KafkaConsumerGroupIdConfig {

    KafkaConsumerConfig kafkaConsumerConfig;

    KafkaConsumerProperties kafkaConsumerProperties;

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Object> notificationKafkaListenerContainerFactory() {
        return kafkaConsumerConfig.kafkaListenerContainerFactory(kafkaConsumerProperties.getNotificationGroupId());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Object> internalKafkaListenerContainerFactory() {
        return kafkaConsumerConfig.kafkaListenerContainerFactory(kafkaConsumerProperties.getInternalGroupId());
    }


}
