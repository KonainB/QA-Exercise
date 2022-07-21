package domain;

public class Customer {
	//fields/attributes
	public int cId;
	public String name;
	public String address;
		public String email;
	//method/behaviour
	public void display()
	{
		System.out.println(cId+"--"+name+"--"+address+"--"+email);
	}

}
