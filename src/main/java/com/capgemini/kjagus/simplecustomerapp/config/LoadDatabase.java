package com.capgemini.kjagus.simplecustomerapp.config;

import com.capgemini.kjagus.simplecustomerapp.customer.Customer;
import com.capgemini.kjagus.simplecustomerapp.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("local")
public class LoadDatabase {

    @Bean
    CommandLineRunner loadSampleCustomers(CustomerRepository repository){
        Customer customer = new Customer();
        customer.setName("sample-customer");
        return args -> {
            repository.save(customer);
        };
    }
}
