package com.example.kafkaspringpractice;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;

@Configuration
@EnableKafka
public class KafkaConfig {
//    @Bean  // boot already provided
//    public ConcurrentKafkaListenerContainerFactory<?, ?> batchFactory(ConsumerFactory<Object, Object> consumerFactory) {
//        ConcurrentKafkaListenerContainerFactory<Object, Object> factory =
//                new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(consumerFactory);
//        factory.setBatchListener(true);  // <<<<<<<<<<<<<<<<<<<<<<<<<
//        factory.setConcurrency(10);
//        return factory;
//    }
//

}
