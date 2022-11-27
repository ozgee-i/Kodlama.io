package odev.dataAccess;

import odev.entities.Category;

public class JdbcCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veri tabanına kategori eklendi");
		
	}

}
