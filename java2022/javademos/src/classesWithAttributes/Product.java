package classesWithAttributes;

public class Product {
	
	public Product(int id,String name,String description,double Price,int stockAmount,String renk) {
		System.out.println("yapıcı blok çalıştı");
		this._id=id;
		this._renk=renk;
		this._name=name;
		this._description=description;
		this._price=Price;
		this._stockAmount=stockAmount;
	}
	public Product() {
		
	}
	
	//attibbute | field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;
	
	//getter ve setter
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		_id=id; 
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		this._name = _name;
	}
	public String getDescription() {
		return _description;
	}
	public void setDescription(String description) {
		this._description = _description;
	}
	public double getPrice() {
		return _price;
	}
	public void setPrice(double price) {
		this._price = _price;
	}
	public int getStockAmount() {
		return _stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this._stockAmount = _stockAmount;
	}
	public String getRenk() {
		return _renk;
	}
	public void setRenk(String renk) {
		this._renk = _renk;
	}
	public String getKod() { //kodu kullanıcının yazmasını engelledi sadece getter
		
		return this._name.substring(0,1)+_id;
	}
	
}
