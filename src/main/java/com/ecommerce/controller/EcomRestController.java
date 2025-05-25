package com.ecommerce.controller;

import com.ecommerce.model.Products;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path="products/product/{id}")
    public Optional<Products> getProductByID(@PathVariable("id") int id){
        return proService.getProductByID(id);
    }

    @DeleteMapping(path = "products/product/Delete/{id}")
    public String deleteProductByID(@PathVariable("id") int id){
        return proService.deleteProductByID(id);
    }

   @PostMapping(path = "products/product/POST")
public Products saveProduct(@RequestBody Products product){
return proService.saveProduct(product);
   }

}
