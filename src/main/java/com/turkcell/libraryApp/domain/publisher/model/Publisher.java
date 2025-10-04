package com.turkcell.libraryApp.domain.publisher.model;

import java.util.Objects;

public class Publisher {
    private final PublisherId id;
    private Name name;
    private Address address;

    private Publisher(PublisherId id, Name name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static Publisher create(Name name, Address address){
        return new Publisher(PublisherId.generate(),
                name,
                address);
    }
    public static Publisher rehdyrate(PublisherId publisherId,Name name, Address address){
        return new Publisher(
                publisherId,
                name,
                address);
    }
    public void changeAddress(Address newAdress){
        Objects.requireNonNull(newAdress);
        this.address = newAdress;
    }
    public PublisherId id() {
        return id;
    }

    public Name name() {
        return name;
    }

    public Address address() {
        return address;
    }
}
