package org;

public class Test {
	public static void main(String[] args) {
		
	    Doable do1=new Doable() { //known as Anonymous- do not need employee class for this
	    	public void doSomething()
	    	{
	    		System.out.println("Employees do something to make their living");
	    	}
	    };
	    do1.doSomething();
	    
	    //LambdaExp
	    //leftside -> rightside
	    //() -> body
	    Doable do2=()->{System.out.println("Employees do something to make their living");};
	    do2.doSomething();
	    
	    
	    Transferrable tr=new Transferrable() {
	    	public void transfer() {
	    		System.out.println("Employees do travel for work");
	    	}
 
	    };
	    tr.transfer();
	    
	    Transferrable tr1=()->{System.out.println("Employees do travel");};
	    tr1.transfer();
	    
	    Workable wk=new Workable() {
	    	public void work() {
	    		System.out.println("Employees can work on different projects based on their skillset");
	    	}
	    	public void getWorkHours() {
	    		
	    	}
	    };
	    wk.work();
	    wk.getWorkHours();
	}

}
