package com.kafkapetproject.dal.entity;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;
@Entity
@Table(name = "wiki_changes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WikiData {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    @Lob
    @Column(name = "wiki_event_data")
    private String wikiEventData;
}
