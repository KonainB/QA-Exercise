package simpleton;

public class Test {
	public static void main(String[] args) {
		Employee.getEmployee().sayHello();
		Employee.getEmployee().sayHi();
		//Employee emp1=new Employee()
        System.out.println(Employee.getEmployee());
        System.out.println(Employee.getEmployee());
        
        System.out.println(Employee.getEmployee());
        System.out.println(Employee.getEmployee());
        
        Customer.getCustomer().sayHello();
        System.out.println(Customer.getCustomer());
	   
	}

}
