package numbers_game;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123456789, sum = 0;
		while (num != 0) {
			sum += num % 10;
			num = num / 10;
//		String num = "12345";
//		int sum =0;
//		 for (int i = 0; i < num.length(); i++) {
//	            sum += Character.getNumericValue(num.charAt(i));
//	        }
			
		}System.out.println(sum);
	}
}
