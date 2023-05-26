package com.kafkapetproject;

import com.kafkapetproject.producer.WikiChangesProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class KafkaPetProjectProducerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(KafkaPetProjectProducerApplication.class);
    }

    private final WikiChangesProducer wikiChangesProducer;

    @Override
    public void run(String... args) throws Exception {
        wikiChangesProducer.sendMessage();
    }
}
