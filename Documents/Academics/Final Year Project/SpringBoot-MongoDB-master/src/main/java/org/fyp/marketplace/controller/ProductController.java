package org.fyp.marketplace.controller;

import org.fyp.marketplace.model.Product;
import org.fyp.marketplace.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/product")
public class ProductController {
    final ProductService productService;

    public ProductController(ProductService productService) {
        super();
        this.productService = productService;
    }

    @GetMapping("/all")
    public List<Product> listAllProduct() {
        try {
            return this.productService.getAllProducts();
        } catch (Exception e) {
            // Log error
            return new ArrayList<Product>();
        }
    }

    @PostMapping("/add")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) throws Exception {
        ResponseEntity<Product> result;
        try {
            this.productService.addProduct(product);
            result = new ResponseEntity<>(product, HttpStatus.OK);
        } catch (Exception e) {
            result = new ResponseEntity<>(product, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return result;
    }
}
