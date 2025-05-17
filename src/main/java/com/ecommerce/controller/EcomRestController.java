package com.ecommerce.controller;

import com.ecommerce.model.Products;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EcomRestController {
    @Autowired
    private ProductService proService;
    @GetMapping(path="products",produces={"application/json"})
    public List<Products> getAllProducts(){
 return  proService.getAllProducts();

    };

    @GetMapping(path="products/{id}")
    public Optional<Products> getProductByID(@PathVariable("id") int id){
        return proService.getProductByID(id);
    }

}
