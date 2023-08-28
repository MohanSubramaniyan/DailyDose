package numbers;
import java.util.*;

public class FactorialOfNumber {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("gimme a number : ");
    	int f=1,i,n=sc.nextInt();
    	for(i=1;i<=n;i++) {
    		f *=i;
    	}
    	System.out.println("factorial of "+n+" is :"+ f);
    }
}
