package com.capgemini.kjagus.simplecustomerapp.customer;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;

@DataJpaTest
public class CustomerRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CustomerRepository customerRepo;

    @Test
    public void should_find_no_customers(){
        Iterable<Customer> customers = customerRepo.findAll();

        Assertions.assertFalse(customers.iterator().hasNext());
    }
}
