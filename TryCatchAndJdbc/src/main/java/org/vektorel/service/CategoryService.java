package org.vektorel.service;

import org.vektorel.entity.Category;
import org.vektorel.repository.CategoryRepository;

public class CategoryService {
    CategoryRepository categoryRepository= new CategoryRepository();

    public void saveCategory(Category category){
        if (categoryRepository.getCategoryByName(category.getName()).getId()
        ==0) {
            categoryRepository.createCategory(category);
        }else {
            System.out.println("bu kategori mevcut: " +category.getName());
        }
    }
}
