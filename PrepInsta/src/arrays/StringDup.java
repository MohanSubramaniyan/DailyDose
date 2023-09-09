package arrays;

public class StringDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "MohanMh";
		char b[] = a.toCharArray();
		int i,j,k=0;
		for(i=0;i<b.length;i++) {
			for(j=i+1;j<b.length;j++) {
				if(b[i]==b[j]) {
					System.out.print(b[i]);
					k++;
				}
			}
		}System.out.println();
		System.out.println(k);
	}

}
