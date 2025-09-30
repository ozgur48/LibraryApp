package com.turkcell.libraryApp.domain.book.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public record BookId(UUID value) implements Serializable {
    public BookId{
        Objects.requireNonNull(value, "Value for BookId cannot be null");
    }

}
