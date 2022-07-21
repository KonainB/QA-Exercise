package homework;

public class Fibonacci {
	public static void main(String[] args) {

	    int n = 10, ft = 0, st = 1;
	    
	    for (int i = 1; i <= n; ++i) {
	      System.out.print(ft + ", ");
	      
	      int nextTerm = ft + st;
	      ft = st;
	      st = nextTerm;

	      

	    }
	  }
	}
