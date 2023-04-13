package com.capgemini.kjagus.simplecustomerapp.customer;

import jakarta.persistence.*;

@Entity
public class Customer {
    private Long id;
    private String name;

    public Customer() {}

    @Id
    @SequenceGenerator(name = "customer_generator", sequenceName = "hibernate_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_generator")
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
