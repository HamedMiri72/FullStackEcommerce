package com.hamedTech.ecommerce.mapper;

import com.hamedTech.ecommerce.dto.CategoryRequest;
import com.hamedTech.ecommerce.dto.CategoryResponse;
import com.hamedTech.ecommerce.entity.CategoryEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class CategoryMapper {

//   public static CategoryEntity toEntity(CategoryRequest request){
//       if(request == null){
//           return null;
//       }
//       return CategoryEntity.builder()
//               .categoryId(UUID.randomUUID().toString())
//               .name(request.getName())
//               .bgColor(request.getBgColor())
//               .description(request.getDescription())
//               .build();
//   }
//
//   public static CategoryResponse EntityToResponse(CategoryEntity entity){
//
//       return CategoryResponse.builder()
//               .categoryId(entity.getCategoryId())
//               .bgColor(entity.getBgColor())
//               .name(entity.getName())
//               .description(entity.getDescription())
//               .imgUrl(entity.getImgUrl())
//               .createdAt(entity.getCreatedAt())
//               .updatedAt(entity.getUpdatedAt())
//               .build();
//   }

    public static CategoryEntity toEntity(CategoryRequest request){

        return CategoryEntity.builder()
                .categoryId(UUID.randomUUID().toString())
                .name(request.getDescription())
                .description(request.getDescription())
                .bgColor(request.getBgColor())
                .build();
    }


    public static CategoryResponse EntityToResponse(CategoryEntity entity){

        return CategoryResponse.builder()
                .name(entity.getName())
                .categoryId(entity.getCategoryId())
                .description(entity.getDescription())
                .bgColor(entity.getBgColor())
                .imgUrl(entity.getImgUrl())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }
}
