package abstractDemo;

public class CustomerManager {
	BaseDatabaseManager databaseManager; //strateji görevi görür.Hangi veritabanını verirsen onun getdata çalışır
	
	public void getCustomer() {
		databaseManager.getData();
	}

}
