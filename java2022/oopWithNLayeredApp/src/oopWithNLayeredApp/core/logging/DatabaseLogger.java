package oopWithNLayeredApp.core.logging;

public class DatabaseLogger implements logger {

	@Override
	public void log(String data) {
		System.out.println("Veritabanı loglandı "+data);
		
	}

}
