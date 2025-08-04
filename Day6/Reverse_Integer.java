/*  26. Reverse an Integer
 *  Write a function to reverse the digits of a given integer.
 */


import java.util.*;
public class Reverse_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = sc.nextInt();
        int rev = reverse(num);
        System.out.println(num + " is reversed to " + rev);
        sc.close();
    }
    public static int reverse(int n){
        int rev = 0;
        while(n != 0){
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }
        return rev;
    }
}