package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private logger[] loggers; //private List<logger>loggers; da yazabilirsin
	
	public ProductManager(ProductDao productDao,logger[] loggers) {
		this.productDao = productDao;
		this.loggers=loggers;
	}

	public void add(Product product) throws Exception {
		//iş kuralları yazarız
		if (product.getUnitPrice()<10) {
			throw new Exception("ürün fiyatı 10'dan küçük olamaz");			
		}
	    productDao.add(product);	
	    for(logger logger:loggers) {
	    	logger.log(product.getName());
	    }
	}
}