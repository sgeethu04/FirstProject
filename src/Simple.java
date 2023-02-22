

import java.util.*;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		Simple.message();
		
		Simple obj = new Simple();
		obj.display();

	}
	
	protected static void message() {
		
		System.out.println("Message inside Simple classś ");
	}
	
	 protected void display() {
		int a=5;
		int result =a+3;
		result = result * (a+result);
		System.out.println("Inside display method "+result);
	}

}
