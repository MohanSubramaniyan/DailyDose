package numbers_game;
public class ArmstrongNum{
	public static void main(String args[]){
		int num=153, len;
		len = order(num);
		
		if(arms(num,len))
			System.out.println("Armstrong buddy!");
		else
			System.out.println("Sorry buddy!");
		}
		static int order(int x){
			int len=0;
			while(x!=0){
				len++;
				x/=10;
			}return len;
		}
		static boolean arms(int num, int len){
			int sum=0,digit,temp;
			temp=num;
			while(temp!=0){
				digit=temp%10;
				sum+=(int)Math.pow(digit,len);
				temp/=10;
			}
			return sum==num;
		}
	}
