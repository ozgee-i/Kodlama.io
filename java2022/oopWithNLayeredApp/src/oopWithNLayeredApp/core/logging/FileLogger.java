package oopWithNLayeredApp.core.logging;

public class FileLogger implements logger {

	@Override
	public void log(String data) {
		System.out.println("Dosya loglandı "+data);
	}

}
