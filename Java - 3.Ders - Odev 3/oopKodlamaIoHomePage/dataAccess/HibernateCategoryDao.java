package oopKodlamaIoHomePage.dataAccess;

import oopKodlamaIoHomePage.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
	public void add(Category category) {
		System.out.println(category.getCategoryname() + " " + "kategorisi Hibarnate ile eklendi");

	}

}
