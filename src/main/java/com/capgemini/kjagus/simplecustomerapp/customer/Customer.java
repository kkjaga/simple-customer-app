package com.capgemini.kjagus.simplecustomerapp.customer;

public class Customer {
    private Long id;
    private String name;

    public Customer() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
