package numbers;

public class OddOrEven {

	public static void main(String[] args) {
		int num = 78;
		if(num==0) {
			System.out.println("The Given Number is Zero");
		}
		else {
		String res=num%2==0?" is even":" is odd";
		System.out.println(num+res);
		}

	}

}
