package odev.dataAccess;

import odev.entities.Category;

public class HibernateCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veri tabanına kategori eklendi");
		
	}

}
