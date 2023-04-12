package com.capgemini.kjagus.simplecustomerapp.customer;

import jakarta.persistence.*;

@Entity
public class Customer {
    private Long id;
    private String name;

    public Customer() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return Customer.class.getSimpleName() + "{" + id + ", " + name + "}";
    }
}
