package numbers_game;

import java.util.*;

public class ArmstrongWithRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit: ");
        int L = sc.nextInt();
        System.out.println("Enter the upper limit: ");
        int H = sc.nextInt();
        System.out.println("Armstrong numbers between " + L + " and " + H + ":");
        
        for (int num = L; num <= H; num++) {
            int sum = 0, digit, temp, len;
            len = order(num);
            temp = num;
            
            while (temp != 0) {
                digit = temp % 10;
                sum += (int) Math.pow(digit, len);
                temp /= 10;
            }
            
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }

    static int order(int x) {
        int len = 0;
        while (x != 0) {
            len++;
            x /= 10;
        }
        return len;
    }
}
