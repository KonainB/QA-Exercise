package Constructor;

public class Product {
	int ProductId;
	float price;
	String name;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, float price, String name) {
		super();
		ProductId = productId;
		this.price = price;
		this.name = name;
	}
	

}
