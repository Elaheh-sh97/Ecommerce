package com.ecommerce.controller;
import com.ecommerce.dto.RegisterRequest;
import com.ecommerce.model.Customer;
import com.ecommerce.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request){
        Customer customer=new Customer();
        customer.setEmail(request.getEmail());
        customer.setUsername(request.getUserName());
        customer.setPassword(passwordEncoder.encode(request.getPassword()));
        customer.setRole("ROLE_USER");
       customerRepository.save(customer);

       return ResponseEntity.ok("User registers successfully");
    }
}
