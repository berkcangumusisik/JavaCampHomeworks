package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) {
        Category[] categories = {new Category(1, "Java"), new Category(2, "C#"), new Category(3, "Python")};
        for (Category category1 : categories) {
            if (category1.getName().equals(category.getName())) {
                System.out.println("Bu kategori zaten mevcut.");
            }
        }

        categoryDao.add(category);
        for (Logger logger : loggers) {
            logger.log(category.getName() + " kategorisi eklendi.");
        }
    }

}
