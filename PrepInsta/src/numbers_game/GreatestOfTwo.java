package numbers_game;

public class GreatestOfTwo {

	public static void main(String[] args) {
		int a=10,b=-12;
		if(a==b)
			System.out.println("both are equal");
		else {
			String res = a>b?("a is big "+a+"> "+b):("b is big "+b+"> "+a);
			System.out.println(res);
		}

	}
//	public class Main {
//	    public static void main(String args[])
//	    {
//	        int num1 = 12, num2 = 21;
//	        if (num1 == num2)
//	            System.out.println("both are equal");
//	        else
//	            // prints the maximum of two numbers
//	            System.out.println(Math.max(num1, num2) + " is greater");
//	    }
//	}

}
