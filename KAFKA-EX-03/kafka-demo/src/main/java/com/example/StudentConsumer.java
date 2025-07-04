package com.example;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

public class StudentConsumer {

    private static final Logger logger = Logger.getLogger(StudentConsumer.class.getName());

    public static void main(String[] args) {

        String bootstrapServers = "localhost:9092";
        String groupId = "student-consumer-group";
        String topic = "new-student-topic";

        Properties props = new Properties();
        props.put("bootstrap.servers", bootstrapServers);
        props.put("group.id", groupId);
        props.put("key.deserializer", StringDeserializer.class.getName());
        props.put("value.deserializer", "org.apache.kafka.common.serialization.ByteArrayDeserializer");
        props.put("auto.offset.reset", "earliest");
        props.put("enable.auto.commit", "true");
        props.put("auto.commit.interval.ms", "1000");

        try (KafkaConsumer<String, byte[]> consumer = new KafkaConsumer<>(props)) {
            consumer.subscribe(Collections.singletonList(topic));

            logger.info("Waiting for messages...");

            while (true) {
                ConsumerRecords<String, byte[]> records = consumer.poll(Duration.ofMillis(1000));
                for (ConsumerRecord<String, byte[]> record : records) {
                    try {
                        System.out.println("Raw data length: " + record.value().length);

                        Object obj = SerializationUtils.deserialize(record.value());

                        if (obj instanceof Student student) {
                            System.out.println("✅ Received student: " + student);
                        } else {
                            System.out.println("⚠️ Deserialized object is not Student: " + obj.getClass().getName());
                        }
                    } catch (Exception e) {
                        System.err.println("❌ Deserialization failed:");
                        e.printStackTrace(); // Konsola tam hata döker
                        logger.severe("Deserialization error: " + e.getMessage());
                    }
                }
            }
        } catch (Exception e) {
            logger.severe("Consumer exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
