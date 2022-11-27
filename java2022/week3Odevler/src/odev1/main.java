package odev1;

public class main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.GiveCredit();
	}

}
