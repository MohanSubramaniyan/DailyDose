package numbers_game;
public class ArmstrongNum{
	public static void main(String[] args) {
		int num=407 , len;
		len = order(num);
		
		
	}
	 static int order(int x) {
		 int len=0;
		 while(x!=0) {
			 len++;
			 x/=10;
		 } System.out.println(x);
		 return x;
		 
	 }
}