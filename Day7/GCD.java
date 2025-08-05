/*  29: Find GCD (Greatest Common Divisor) Using Recursion
 *  Write a recursive function to find the GCD of two numbers.
 */


import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int res = findGCD(a, b);
        System.out.println("GCD of " + a + " & " + b + " = " + res);
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}