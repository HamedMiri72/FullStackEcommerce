package com.hamedTech.ecommerce.controller;

import com.hamedTech.ecommerce.dto.CategoryRequest;
import com.hamedTech.ecommerce.dto.CategoryResponse;
import com.hamedTech.ecommerce.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {


    private final CategoryService categoryService;

    @PostMapping
    public ResponseEntity<CategoryResponse> addCategory(@RequestBody CategoryRequest request){

        CategoryResponse response = categoryService.addCategory(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }
}
