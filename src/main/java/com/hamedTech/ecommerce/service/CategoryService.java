package com.hamedTech.ecommerce.service;

import com.hamedTech.ecommerce.dto.CategoryRequest;
import com.hamedTech.ecommerce.dto.CategoryResponse;

public interface CategoryService {

  CategoryResponse addCategory(CategoryRequest request);

}
