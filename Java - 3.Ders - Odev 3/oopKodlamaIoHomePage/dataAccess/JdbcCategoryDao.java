package oopKodlamaIoHomePage.dataAccess;

import oopKodlamaIoHomePage.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
	public void add(Category category) {
		System.out.println(category.getCategoryname() + " " + "kategorisi jdbc ile eklendi");

	}

}
