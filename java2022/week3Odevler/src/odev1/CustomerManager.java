package odev1;

public class CustomerManager {
	private CreditManager _creditManager;
	private Customer _customer;
	public CustomerManager (Customer customer, CreditManager creditManager) {
		_customer =customer;
		_creditManager = creditManager;
	}
	
	public void GiveCredit() {
		_creditManager.Calculate();
		System.out.println("kredi verildi.");
	}

}
