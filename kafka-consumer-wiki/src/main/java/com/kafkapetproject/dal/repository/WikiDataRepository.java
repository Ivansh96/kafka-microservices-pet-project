package com.kafkapetproject.dal.repository;

import com.kafkapetproject.dal.entity.WikiData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WikiDataRepository extends JpaRepository<WikiData, UUID> {
}
