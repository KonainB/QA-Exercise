package simpleton;

public class Customer {
	static Customer cust=new Customer();
	private Customer() {}
	
	public static Customer getCustomer()
	{
		return cust;
	}
	public void sayHello()
	{
		System.out.println("Hello what would you like to buy");
	}

}
