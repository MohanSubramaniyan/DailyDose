package pattern;

public class Triangle {

	public static void main(String[] args) {
		int i, j, m, num = 10; //k=0
		for (i = 1; i <= num; i++) {
			for (m = 1; m <= num - i; m++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
//				k++;
//				if(k%2==0)
//					System.out.print(0+" ");
//				else
//					System.out.print(1+" ");
			}

			System.out.println();
		}
	}

}
