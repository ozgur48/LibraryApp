package com.turkcell.libraryApp.infrastructure.persistence.member;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Size;

@Embeddable
public class JpaAddress {
    @Column(nullable = false, length = 255)
    private String street;

    @Column(nullable = false)
    @Size(min=2, max=60)
    private String city;

    @Column(nullable = false)
    @Size(min=3, max=12)
    private String zipCode;

    @Column(nullable = false)
    @Size(min=2, max=60)
    private String country;
    protected JpaAddress(){}

    public JpaAddress(String street, String city, String zipCode, String country) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }
    public String country() {
        return country;
    }

    public String zipCode() {
        return zipCode;
    }

    public String city() {
        return city;
    }

    public String street() {
        return street;
    }

}
