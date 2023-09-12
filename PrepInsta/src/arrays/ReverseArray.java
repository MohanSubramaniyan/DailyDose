package arrays;

public class ReverseArray{
	public static void main(String[] args) {
		int arr []= {1,2,3,4,5,6,7,7,8,9,0};
		int n=arr.length-1;
		System.out.print("[");
		for(int i=n;i>=0;i--) {
			System.out.print(arr[i]);
			if(i>0)
				System.out.print(",");
		}System.out.print("]");
	}
}