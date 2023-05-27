package com.kafkapetproject.consumer;

import com.kafkapetproject.dal.entity.WikiData;
import com.kafkapetproject.dal.repository.WikiDataRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaDatabaseConsumer {
    private final WikiDataRepository dataRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

    @KafkaListener(
            topics = "wiki_changes",
            groupId = "consGroup"
    )
    public void consume(String eventMessage) {

        LOGGER.info(String.format("Event message received -> %s", eventMessage));

        WikiData wikiData = new WikiData();
        wikiData.setWikiEventData(eventMessage);

        dataRepository.save(wikiData);
    }
}
