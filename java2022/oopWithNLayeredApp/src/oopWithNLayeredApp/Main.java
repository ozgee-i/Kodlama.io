package oopWithNLayeredApp;

import java.util.List;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.core.logging.logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1=new Product(1,"Iphone",1000);
		
		logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		ProductManager productManager=new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);
		
	}

}
