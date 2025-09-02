package com.hamedTech.ecommerce.service.serviceImpl;

import com.hamedTech.ecommerce.dto.CategoryRequest;
import com.hamedTech.ecommerce.dto.CategoryResponse;
import com.hamedTech.ecommerce.entity.CategoryEntity;
import com.hamedTech.ecommerce.mapper.CategoryMapper;
import com.hamedTech.ecommerce.repository.CategoryRepository;
import com.hamedTech.ecommerce.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;

    @Override
    public CategoryResponse addCategory(CategoryRequest request) {

        CategoryEntity newCategory = repository.save(CategoryMapper.toEntity(request));

        CategoryResponse response = CategoryMapper.EntityToResponse(newCategory);

        return response;
    }
}
