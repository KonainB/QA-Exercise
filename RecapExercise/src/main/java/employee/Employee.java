package employee;

public class Employee {
	String firstName;
	String lastName;
	int age;
	String address;
	String phoneNo;
	String email;
	int basicSalary;

	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, int age, String address, String phoneNo, String email,
			int basicSalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
		this.basicSalary = basicSalary;
	}

	public int calculateSalary(int salary) {
		this.basicSalary = salary;
		int finalSalary = (basicSalary * 10 / 100) + basicSalary;
		return finalSalary;
	}

	public String greeting() {
		return "Hello " + firstName + " " + lastName;
	}
	
	public boolean checkPhone()
	{
		if(phoneNo.length()!=10)
			return false;
		else 
			return true;
	}
	
	public boolean checkEmail()
	{
		if(email.contains("@"))
			return true;
		else 
			return false;
	}

}
