package com.turkcell.libraryApp.infrastructure.persistence.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaMemberRepository extends JpaRepository<JpaMemberEntity, UUID> {

}
