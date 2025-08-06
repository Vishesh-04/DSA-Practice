/*  34. Find the Factorial of a Number
 *  Write a function to calculate the factorial of a given number using recursion.
 */


import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        sc.close();
        int res = fact(num, 1);
        System.out.println("The Factorial of " + num + " is " + res);
    }
    public static int fact(int n, int f){
        if(n == 1){
            return f;
        }
        return fact(n - 1, f * n);
    }
}
