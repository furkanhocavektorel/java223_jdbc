package org.vektorel.service;

import org.vektorel.entity.Category;
import org.vektorel.repository.BaseRepository;
import org.vektorel.repository.CategoryRepository;
import org.vektorel.utility.Singleton;

public class CategoryService {
    BaseRepository<Category> categoryRepository;

    public CategoryService() {
        this.categoryRepository=Singleton.getCategoryRepository();
    }

    public void saveCategory(Category category){
            categoryRepository.save(category);
    }
}
