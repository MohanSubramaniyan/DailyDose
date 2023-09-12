package arrays;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		int arr[]= {23,42,42,4,2,4,2,9};
		int i,sum=0;
		for(i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
