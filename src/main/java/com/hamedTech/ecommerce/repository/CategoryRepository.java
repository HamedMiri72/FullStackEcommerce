package com.hamedTech.ecommerce.repository;

import com.hamedTech.ecommerce.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
