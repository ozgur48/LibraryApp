package com.turkcell.libraryApp.domain.member.model;

public class Member {
    private final MemberId id;
    private Name name;
    private Email email;
    private Phone phone;
    private Address address;
    private MemberShipLevel memberShipLevel;
    private MemberStatus memberStatus;

    private Member(MemberId id, Name name, Email email, Phone phone, Address address, MemberShipLevel memberShipLevel, MemberStatus memberStatus){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.memberShipLevel = memberShipLevel;
        this.memberStatus = memberStatus;
    }
    public static Member create(Name name, Email email, Phone phone, Address address, MemberShipLevel memberShipLevel, MemberStatus memberStatus){
        return new Member(MemberId.generate(), name, email, phone, address, memberShipLevel, memberStatus);
    }
    public static Member rehydrate(MemberId id, Name name, Email email, Phone phone, Address address, MemberShipLevel memberShipLevel, MemberStatus memberStatus){
        return new Member(id, name, email, phone, address, memberShipLevel, memberStatus);
    }
    public void changeAddress(Address newAddress){
        this.address = newAddress;
    }

    public MemberId id() {
        return id;
    }

    public Name name() {
        return name;
    }

    public Email email() {
        return email;
    }

    public Phone phone() {
        return phone;
    }

    public Address address() {
        return address;
    }

    public MemberShipLevel memberShipLevel() {
        return memberShipLevel;
    }

    public MemberStatus memberStatus() {
        return memberStatus;
    }
}
