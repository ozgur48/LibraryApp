package com.turkcell.libraryApp.infrastructure.persistence.publisher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaPublisherRepository extends JpaRepository<JpaPublisherEntity, UUID> {
}
