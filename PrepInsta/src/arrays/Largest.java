package arrays;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={23,434,232,02,-2,2,4342,-0};
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		} System.out.println(max);
	}

}
