package com.ecommerce.security;

import com.ecommerce.model.Customer;
import com.ecommerce.model.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public class CustomerDetail implements UserDetails {

    private Set<Role> roles;
    private Customer customer;

    public CustomerDetail(Customer customer) {
        this.customer=customer;
        this.roles = Collections.singleton(customer.getRole());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
       return roles.stream()
               .map(role->new SimpleGrantedAuthority("ROLE_"+role.name())).collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return customer.getPassword();
    }

    @Override
    public String getUsername() {
        return customer.getUsername();
    }

    public Customer getCustomer(){
    return customer;
    }
}
