package com.ecommerce.controller;
import com.ecommerce.dto.CustomerDto;
import com.ecommerce.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private CustomerService customerService;

    @Autowired
   private AuthenticationManager authenticationManager;
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody CustomerDto customerDto){
     customerService.register(customerDto);
       return ResponseEntity.ok("User registers successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody CustomerDto customerDto){
        Authentication authentication=authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                customerDto.getUsername(),
                customerDto.getPassword()
        ));
        return ResponseEntity.ok("Login successful");
    }

}
