/*  28: Find LCM (Least Common Multiple)
 *  Write a function to find the LCM of two numbers using the GCD.
 */


import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find their LCM:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int lcm = findLCM(a, b);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
