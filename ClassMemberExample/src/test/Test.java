package test;


	import domain.Book;
	import domain.Customer;
	import domain.Phone;
	
public class Test {
	
	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.cId=1001;
		c1.name="David";
		c1.address="UK";
		c1.email="d@gmail.com";
		c1.display();
		Customer c2=new Customer();
		c2.cId=1002;
		c2.name="Ron";
		c2.address="USA";
		c2.email="r@gmail.com";
		c2.display();
		Book b1=new Book();
		b1.bId=2001;
		b1.title="tell me your dreams";
		b1.author="Sidney Sheldon";
		b1.show();
		Phone p1=new Phone();
		p1.model="Samsung";
		p1.colour="Black";
		p1.price=500.99f;
		p1.show();
	}
}


