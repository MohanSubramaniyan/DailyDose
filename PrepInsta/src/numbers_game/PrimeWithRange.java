package numbers_game;

public class PrimeWithRange {
	
		public static void main(String args[]){
			int l=10,u=25;
			for(int i=l ; i<=u ; i++){
				if(prm(i))
					System.out.println(i);
			}
		}
		static boolean prm (int n){
			if(n<2)
				return false;
			for(int i=2;i<=n/2;i++)
				if(n%i==0){
					return false;
				}
			return true;
			
		}
	
}
