package poly;

public abstract class Products {
	String name;
	float price; 
	int productId;
	
	public Products(String name, float price, int productId) {
		super();
		this.name = name;
		this.price = price;
		this.productId = productId;
	}
	public final void talk() {}
	public abstract void doSomething();
}
