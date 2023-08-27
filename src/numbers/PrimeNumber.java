package numbers;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int count = 1;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count = 2;
				break;
			}
		}
		if (count == 1) {
			System.out.println("prime da ambi");
		} else {
			System.out.println("not a prime raa ambi");
		}
	}

}
