package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("kahve makinesi");
		product1.setDiscount(7);
		product1.setImageUrl("bilmemne.jpg");
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(5);

		Product product2 = new Product();
		product2.setName("smeg kahve makinesi");
		product2.setDiscount(7);
		product2.setImageUrl("bilmemne.jpg");
		product2.setUnitPrice(10000);
		product2.setUnitsInStock(3);

		Product product3 = new Product();
		product3.setName("arçelik kahve makinesi");
		product3.setDiscount(7);
		product3.setImageUrl("bilmemne.jpg");
		product3.setUnitPrice(6500);
		product3.setUnitsInStock(7);
		
		Product[] products = {product1,product2,product3};
		
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer=new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0512312123");
		individualCustomer.setCustomerNumber("123456789");
        individualCustomer.setFirstName("ali");
        individualCustomer.setLastName("bilinmez");
        
        CorporateCustomer corporateCustomer=new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("kodlama.io");
        corporateCustomer.setPhone("0533333");
        corporateCustomer.setTaxNumber("1111111111");
        corporateCustomer.setCustomerNumber("54321");
        
        Customer[] customers= {individualCustomer,corporateCustomer};
	}

}
