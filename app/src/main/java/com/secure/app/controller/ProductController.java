package com.secure.app.controller;

import com.secure.app.model.Product;
import com.secure.app.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/products")
    public ResponseEntity<List<Product>> getAllProducts(){
        log.info("Endpoint Called - getAllProducts()");
        return new ResponseEntity<>(productService.getAllProducts() , HttpStatus.OK);
    }

    @GetMapping("product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id){
        Product product = productService.getProductById(id);
        if (null!=product)
            return new ResponseEntity<>(productService.getProductById(id), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
