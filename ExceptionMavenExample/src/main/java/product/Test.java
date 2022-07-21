package product;

public class Test {
	public static void main(String[] args) {
		Product obj1 = new ProductBuilder()
				.name("TV")
				.buildProduct();
		
		Product obj2 = new ProductBuilder()
				.id(101)
				.name("TV")
				.brand("devops")
				.price(123)
				.buildProduct();
				

	}

}
