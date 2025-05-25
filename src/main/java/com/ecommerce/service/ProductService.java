package com.ecommerce.service;

import com.ecommerce.model.Products;
import com.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
   private ProductRepository productrepo;
public List<Products> getAllProducts(){
    return productrepo.findAll();
}

public Optional<Products> getProductByID(int id){
    return productrepo.findById(id);
}

public String deleteProductByID(int id){
     productrepo.deleteById(id);
     return "Product is deleted";
}

public Products saveProduct(Products product){
  return  productrepo.save(product);
}



}

