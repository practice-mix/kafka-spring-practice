package com.example.kafkaspringpractice;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyTopicListener {

    @KafkaListener(id = "list", topics = "myTopic", containerFactory = "batchFactory")
    public void listen(List<String> list,
                       @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) List<Integer> keys,
                       @Header(KafkaHeaders.RECEIVED_PARTITION_ID) List<Integer> partitions,
                       @Header(KafkaHeaders.RECEIVED_TOPIC) List<String> topics,
                       @Header(KafkaHeaders.OFFSET) List<Long> offsets) {

        System.out.println("list = " + list + ", keys = " + keys + ", partitions = " + partitions + ", topics = " + topics + ", offsets = " + offsets);

    }

    @KafkaListener(id = "listMsg", topics = "myTopic", containerFactory = "batchFactory")
    public void listen14(List<Message<?>> list) {
        System.out.println("list = " + list);
    }

    @KafkaListener(id = "listCRs", topics = "myTopic", containerFactory = "batchFactory")
    public void listen(List<ConsumerRecord<Integer, String>> list) {
        System.out.println("list = " + list);
    }
}
