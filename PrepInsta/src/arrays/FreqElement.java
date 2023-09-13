package arrays;

import java.util.Arrays;

public class FreqElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 53, 67, 47, 4, 34, 6, 4, 3, 54, 54, 54 };
		int size = arr.length;
		Arrays.sort(arr);
		countFreq(arr,size);
	}
	static void countFreq(int arr[], int size) {
		for(int i=0;i<size;i++) {
			int flag=0,count=0;
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					flag=1;
					break;
				}
			} if(flag==1) 
				continue;
			for(int j=0;j<size;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			System.out.println(arr[i]+": "+count);
		}
	}

}
