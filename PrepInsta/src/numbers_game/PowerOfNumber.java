package numbers_game;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double base=2;
//		double  expo=3;
//		int res = (int) Math.pow(base, expo);
//		System.out.println(res);
//		
		double base = 3.0;
		int expo=2;
		int res =1;
		while(expo!=0) {
			res*=base;
			base--;
		}
		 
	}

}
