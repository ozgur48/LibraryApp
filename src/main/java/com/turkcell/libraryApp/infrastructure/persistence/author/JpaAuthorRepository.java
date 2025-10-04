package com.turkcell.libraryApp.infrastructure.persistence.author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaAuthorRepository extends JpaRepository<JpaAuthorEntity, UUID> {

}
