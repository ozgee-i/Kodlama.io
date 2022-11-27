package odev.business;

import odev.core.logging.logger;
import odev.dataAccess.ICategoryDao;
import odev.entities.Category;

public class CategoryManager {
	private ICategoryDao categoryDao;
	private logger[] loggers;
	
	public CategoryManager(ICategoryDao categoryDao, logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		if (category.getCategoryName().equals(category.getCategoryName())) {
			throw new Exception("Bu kurs zaten sistemde kayıtlıdır.");
		}
		categoryDao.add(category);
	}
		
}
