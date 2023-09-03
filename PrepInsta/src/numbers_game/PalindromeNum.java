package numbers_game;

public class PalindromeNum {

	public static void main(String[] args) {
		int num=12321,temp=num,a=0,rem;
		// TODO Auto-generated method stub
		for(;num!=0;num/=10) {
			rem=num%10;
			a=a*10+rem;
		}
		String res= temp==a?"Palindrome":"not";
		System.out.println(res);
	}

}
