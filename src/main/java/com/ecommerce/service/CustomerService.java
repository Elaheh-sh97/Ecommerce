package com.ecommerce.service;

import com.ecommerce.dto.CustomerDto;
import com.ecommerce.model.Customer;
import com.ecommerce.model.Role;
import com.ecommerce.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private CustomerRepository customerRepository;

    public void register(CustomerDto customerDto){
        Customer customer=new Customer();
        customer.setUsername(customerDto.getUsername());
//        customer.setEmail(customerDto.getEmail());

        customer.setPassword(passwordEncoder.encode(customerDto.getPassword()));
        customer.setRole(Role.CUSTOMER);
        System.out.println(customer.getPassword());
        customerRepository.save(customer);

    }
}
