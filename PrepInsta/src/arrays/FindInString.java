package arrays;

public class FindInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "adbah&33## 0923shb.";
		char b[] = a.toCharArray();
		for(char c:b) {
			// to find alphas only
//			if(Character.isAlphabetic(c))
			//to find nums
			if(Character.isDigit(c))
			System.out.print(c+" ");
		}
	}

}
