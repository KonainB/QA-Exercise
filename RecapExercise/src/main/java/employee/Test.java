package employee;

import java.util.Scanner;

public class Test {
	
    public static void main(String[] args) {

    	Employee e1=new Employee();
    	e1.firstName="John";
    	e1.lastName="Doe";
    	e1.age=20;
    	e1.address="London";
    	e1.phoneNo="1234567890";
    	e1.email="kb@gmail.com";
    	e1.basicSalary=25000;
        int tempSalary=e1.calculateSalary(20000);
        System.out.println(tempSalary);
        System.out.println(e1.greeting());
        System.out.println(e1.checkPhone());
        System.out.println(e1.checkEmail());
    }
} 
        