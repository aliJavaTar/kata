package com.low_of_demeter;

public class Customer {

    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public String getAddress() {
        return address.getStreet();
    }
}
