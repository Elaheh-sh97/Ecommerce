package com.ecommerce;

import com.ecommerce.controller.EcomRestController;
import com.ecommerce.model.Customer;

import com.ecommerce.model.Products;
import com.ecommerce.repository.CustomerRepository;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ECommerceApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(ECommerceApplication.class, args);



    }

}
