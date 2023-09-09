package numbers_game;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=15,a=0,b=7,i;
		for(i=0;i<=num;i++) {
			int nxt=a+b;
			a=b;
			b=nxt;
			System.out.print(nxt+" ");
		}
	}

}
