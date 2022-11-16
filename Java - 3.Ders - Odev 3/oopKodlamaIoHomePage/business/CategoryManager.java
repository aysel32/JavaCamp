package oopKodlamaIoHomePage.business;

import oopKodlamaIoHomePage.core.logging.Logger;
import oopKodlamaIoHomePage.dataAccess.CategoryDao;
import oopKodlamaIoHomePage.dataAccess.JdbcCategoryDao;
import oopKodlamaIoHomePage.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		if (category.getCategoryname() == category.getCategoryname()) {
			throw new Exception(category.getCategoryname() + " " + "Kategori zaten eklenmiş. Kategori ismi tekrar edemez");

		}
		// JdbcCategoryDao categoryDao = new JdbcCategoryDao();
		categoryDao.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getCategoryname());
		}
	}

}
