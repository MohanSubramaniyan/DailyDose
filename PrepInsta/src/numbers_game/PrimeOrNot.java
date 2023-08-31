package numbers_game;
import java.util.*;
public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i, n= sc.nextInt();
		boolean prm= true;
		sc.close();
		if(n<2)
			prm= false;
		else {
			for(i=2;i<=n/2;i++) {
				if(n%i==0) {
					prm=false;
					break;
				}
			}
		}String res = prm?"Prime":"not a prime";
		System.out.println(n+" is "+res);
	} 

	
}
