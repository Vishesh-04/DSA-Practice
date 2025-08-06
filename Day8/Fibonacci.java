/*  31: Fibonacci Sequence (Recursive)
 *  Write a recursive function to find the nth Fibonacci number.
 */


import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int res = helper(n);
        System.out.println(n + "th Fibonacci number is: " + res);
    }
    public static int helper(int n){
        if(n <= 1){
            return n;
        }
        return helper(n - 1) + helper(n - 2);
    }
}