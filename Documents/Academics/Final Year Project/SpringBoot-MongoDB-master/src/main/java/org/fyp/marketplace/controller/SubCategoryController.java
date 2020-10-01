package org.fyp.marketplace.controller;

import org.fyp.marketplace.model.SubCategory;
import org.fyp.marketplace.service.SubCategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/subCategory")
public class SubCategoryController {
    final SubCategoryService subCategoryService;

    public SubCategoryController(SubCategoryService subCategoryService) {
        super();
        this.subCategoryService = subCategoryService;
    }

   

    @PostMapping("/add")
    public ResponseEntity<SubCategory> createSubCategory(@RequestBody SubCategory subCategory) throws Exception {
        ResponseEntity<SubCategory> result;
        try {
            this.subCategoryService.addSubCategory(subCategory);
            result = new ResponseEntity<>(subCategory, HttpStatus.OK);
        } catch (Exception e) {
            result = new ResponseEntity<>(subCategory, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return result;
    }
}
