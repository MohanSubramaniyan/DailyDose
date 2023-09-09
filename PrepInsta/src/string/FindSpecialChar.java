package string;

public class FindSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "fb**782 9";		
		// to print a special char count
		String  res = a.replaceAll("[a-zA-z0-9]", "");
		System.out.println(res.length());
		// to remove white space
//		String  res = a.replaceAll("\\s", "");
//		System.out.println(res.length());
	}

}
