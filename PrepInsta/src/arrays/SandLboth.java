package arrays;

public class SandLboth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,33,243,323,-24,343,0,342,432};
		int lar=arr[0],small=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(small>arr[i]) // 12>12
				small=arr[i];
			if(lar<arr[i])
				lar=arr[i];
		}
		System.out.println(small);
		System.out.println(lar);
	}

}
