package com.turkcell.libraryApp.domain.member.model;

public record Name(String name) {
    public Name{
        if(name == null || name.isEmpty())
            throw new IllegalArgumentException("Name cannot be null or empty");
        if(name.length() >= 255)
            throw new IllegalArgumentException("Name length must be less than 255 characters");
    }
}
