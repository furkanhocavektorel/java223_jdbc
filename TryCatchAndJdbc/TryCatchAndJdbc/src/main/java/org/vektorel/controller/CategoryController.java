package org.vektorel.controller;

import org.vektorel.entity.Category;
import org.vektorel.service.CategoryService;

public class CategoryController {

    CategoryService categoryService= new CategoryService();

    public void createCategory(String categoryName){
        Category category= new Category();
        category.setName(categoryName);
       categoryService.saveCategory(category);

    }
}
