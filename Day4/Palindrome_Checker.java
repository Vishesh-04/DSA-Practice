/*  14. Palindrome Checker
 *  Problem: Goutam and Tanul play by telling numbers. 
 * Goutam says a number to Tanul. 
 * Tanul should first reverse the number and check if it is the same as the original. 
 * If yes, Tanul should say "Palindrome". 
 * If not, he should say "Not a Palindrome". 
 * If the number is negative, print "Invalid Input". Help Tanul by writing a program.
 */

import java.util.*;
public class Palindrome_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String num = sc.nextLine();
        sc.close();
        num = num.trim();
        if(num.charAt(0) == '-'){
            System.out.println("Invalid Input");
        }
        else{
            StringBuilder srev = new StringBuilder(num);
            srev.reverse();
            if(num.equals(srev.toString())){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not a Palindrome");
            }
        }
    }
}
