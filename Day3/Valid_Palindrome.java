/*  12. Valid Palindromes
 * Problem: You are given a string s containing blanks ('_') and an integer n. 
 * Your task is to count the total number of ways to fill the blanks such that the resultant string becomes a valid palindrome. 
 * Since the result can be large, return the answer modulo n.
 * Input:
 * •	s (String): The string containing blanks and other characters.
 * •	n (Integer): The modulus value.
 * Output: Return the number of valid palindromes that can be formed by filling the blanks, modulo n.

 */

import java.util.*;
public class Valid_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println(helper(s, n));
        sc.close();
    }
    public static int helper(String s, int n){
        int res = 1, m = s.length();
        for(int i = 0; i < m / 2; i++){
            if(s.charAt(i) == '_' && s.charAt(m - 1 - i) == '_'){
                res = (res * 26) % n;
            }
            else if (s.charAt(i) == '_' || s.charAt(m - 1 - i) == '_') {
                res *= 1;
            }
            else{
                if(s.charAt(i) != s.charAt(m - 1 - i)){
                    return 0;
                }
                else{
                    continue;
                }
            }
        }
        return res % n;
    }
}
