package numbers_game;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10,a=0,b=1,i;
		for(i=1;i<30;i++) {
			int nxt=a+b;
			a=b;
			b=nxt;
			System.out.print(nxt+" ");
		}
	}

}
