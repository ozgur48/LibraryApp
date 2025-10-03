package com.turkcell.libraryApp.domain.member.model;


public record Address(String street, String city, String zipCode, String country) {
    public Address{
        if(street == null || street.isBlank())
            throw new IllegalArgumentException("Street cannot be empty");
        if (city == null || city.isBlank())
            throw new IllegalArgumentException("City cannot be empty");
        if (zipCode == null || zipCode.isBlank())
            throw new IllegalArgumentException("Zip code cannot be empty");
        if (!zipCode.matches("^[0-9A-Za-z\\- ]{3,10}$"))
            throw new IllegalArgumentException("Zip code format is invalid");
        if (country == null || country.isBlank())
            throw new IllegalArgumentException("Country cannot be empty");
    }
}
