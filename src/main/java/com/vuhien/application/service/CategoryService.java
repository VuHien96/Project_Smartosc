package com.vuhien.application.service;

import com.vuhien.application.entity.Category;
import com.vuhien.application.model.dto.CategoryDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    List<CategoryDTO> getListCategory();
    CategoryDTO getCategoryById(int categoryId);
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryDTO updateCategory(CategoryDTO categoryDTO,int categoryId);
    void deleteCategory(int categoryId);
    Page<Category> getListCategoryByCategoryNameContaining(Pageable pageable, String categoryName);
}
