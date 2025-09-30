package com.turkcell.libraryApp.domain.member.model;

public record Email(String value) {
    public Email{
        if(value == null || value.isBlank())
            throw new IllegalArgumentException("Email boş olamaz");
        if(!value.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$"))
            throw new IllegalArgumentException("Email formatı hatalı");
    }
}
