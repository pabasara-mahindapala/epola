package org.fyp.marketplace.controller;

import org.fyp.marketplace.model.Category;
import org.fyp.marketplace.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/category")
public class CategoryController {
    final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        super();
        this.categoryService = categoryService;
    }

    @GetMapping("/all")
    public List<Category> listAllCategory() {
        try {
            return this.categoryService.getAllCategory();
        } catch (Exception e) {
            // Log error
            return new ArrayList<Category>();
        }
    }

    @PostMapping("/add")
    public ResponseEntity<Category> createCategory(@RequestBody Category category) throws Exception {
        ResponseEntity<Category> result;
        try {
            this.categoryService.addCategory(category);
            result = new ResponseEntity<>(category, HttpStatus.OK);
        } catch (Exception e) {
            result = new ResponseEntity<>(category, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return result;
    }
}
