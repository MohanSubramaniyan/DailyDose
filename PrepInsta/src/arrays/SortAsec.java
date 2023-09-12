package arrays ;

class SortAsec{
	public static void main(String[] args) {
		int n, i,j,temp, arr[]= {40,2,342,-32,-0,24};
		n=arr.length;
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(arr[j]<arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("[");
		for(int x:arr) {
			System.out.print(x);
			if(x!=arr[arr.length-1]) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
}