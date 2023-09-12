package arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5, 2, 9, 1, 5, 6};
		int smallest = Integer.MAX_VALUE;
		int sec_smallest = Integer.MAX_VALUE;

		for (int num : array) {
		    if (num < smallest) {
		        sec_smallest = smallest;
		        smallest = num;
		    } else if (num < sec_smallest && num != smallest) {
		        sec_smallest = num;
		    }
		}

		System.out.println("Smallest: " + smallest);
		System.out.println("Second Smallest: " + sec_smallest);

	}

	
	}


