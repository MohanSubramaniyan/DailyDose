package pattern;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,num=10;
		// upper part
		for(i=1;i<=num;i++) {
			for(k=1;k<=num-i;k++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			} System.out.println();
		}
		
		//lower part
		for(i=num-1;i>=1;i--) {
			for(k=1;k<=num-i;k++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			} System.out.println();
		}
		
	}

}
