package com.example;

import java.util.Properties;
import java.util.concurrent.Future;
import java.util.logging.Logger;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;

public class StudentProducer {

    private static final Logger logger = Logger.getLogger(StudentProducer.class.getName());

    public static void main(String[] args) {
        String bootstrapServers = "localhost:9092";
        String topic = "new-student-topic";

        Properties props = new Properties();
        props.put("bootstrap.servers", bootstrapServers);
        props.put("key.serializer", StringSerializer.class.getName());
        props.put("value.serializer", "org.apache.kafka.common.serialization.ByteArraySerializer");

        try (KafkaProducer<String, byte[]> producer = new KafkaProducer<>(props)) {
            Student student = new Student(1, "Zeynep");

            byte[] serializedStudent = SerializationUtils.serialize(student);

            ProducerRecord<String, byte[]> record = new ProducerRecord<>(topic, serializedStudent);

            Future<RecordMetadata> future = producer.send(record);

            RecordMetadata metadata = future.get();
            System.out.println("Message sent to topic " + metadata.topic() +
                    ", partition " + metadata.partition() +
                    ", offset " + metadata.offset());

        } catch (Exception e) {
            logger.severe(String.format("Error while sending message: %s", e.getMessage()));
        }
    }
}
