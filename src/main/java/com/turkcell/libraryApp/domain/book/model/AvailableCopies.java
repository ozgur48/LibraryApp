package com.turkcell.libraryApp.domain.book.model;

import java.math.BigDecimal;
import java.util.Objects;

public record AvailableCopies(Integer copy) {
        public AvailableCopies{
            Objects.requireNonNull(copy, "Available copy null olamaz");
            if(copy < 0)
                throw new IllegalArgumentException("Avaliable copy negatif olamaz");

    }
}
