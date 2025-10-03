package com.turkcell.libraryApp.infrastructure.persistence.publisher;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

import java.util.UUID;

@Entity
@Table(name="publishers")
public class JpaPublisherEntity {
    @Id
    @Column(columnDefinition = "uuid")
    private UUID id;

    @Column(nullable = false)
    @Size(min=1, max = 255)
    private String name;

    @Column(nullable = false, length = 255)
    private String address;

    public UUID id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String address() {
        return address;
    }
}
