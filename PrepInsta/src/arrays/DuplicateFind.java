package arrays;

public class DuplicateFind {

    public static void main(String[] args) {
        int a[] = {23, 34, 443, 34, 0, 0, 23};
        int i, j, k=0;

        System.out.print("Duplicate elements are: ");

        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.print(a[i]+" ");
                    k++;
                }
            }
        } 
        System.out.println();
        System.out.println("duplicate count is : "+k);
    }
}
