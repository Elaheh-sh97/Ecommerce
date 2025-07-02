package com.ecommerce.security;


import com.ecommerce.model.Customer;
import com.ecommerce.repository.CustomerRepository;
import org.springframework.security.core.GrantedAuthority;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CustomerDetailService implements UserDetailsService {
    private CustomerRepository customerRepository;
    public CustomerDetailService(CustomerRepository customerRepository) {
        this.customerRepository=customerRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Customer customer=customerRepository.findByUsername(username)
                .orElseThrow(()->new UsernameNotFoundException("User not found"+username));
        return new CustomerDetail(customer);
    }
}
