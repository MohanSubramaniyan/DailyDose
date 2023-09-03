package numbers_game;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345, a=0, rem;
		while(num!=0) {
			rem=num%10;   //12345 becomes 5 , 4, 3, 2, 1
			a=a*10+rem;	// 0=0*10+5=5 ,5=5*10+4=54 , 54=540+3 , 543=5430+2, 5432
						// 
			num/=10;	//1234  123  12 1
		}
		System.out.println(a);
	}

}
