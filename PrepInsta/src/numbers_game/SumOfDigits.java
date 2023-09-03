package numbers_game;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123456789, sum =0;
		while(num!=0) {
			sum+=num%10;
			num=num/10;
		}
		System.out.println(sum +" "+num);
	}

}
