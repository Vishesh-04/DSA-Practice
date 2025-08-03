/*  22. Buzz Number Check
 *  Problem: Implement a function to check whether a given number is a Buzz number or not. 
 *  A Buzz number is a number that ends with the digit 7 or is divisible by 7.
 */


import java.util.*;
public class Buzz_Number_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();
        if(n % 7 == 0 || n % 10 == 7){
            System.out.println(n + " is a Buzz Number");
        }
        else{
            System.out.println(n + " is not a Buzz Number");
        }
    }
}