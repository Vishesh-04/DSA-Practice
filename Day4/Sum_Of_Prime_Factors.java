/*  16. Sum of Prime Factors
 * Problem: Find the sum of prime factors of a number.
 */


import java.util.*;
public class Sum_Of_Prime_Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for(int i = 2; i <= n; i++){
            if((n % i) == 0){
                if(isPrime(i)){
                    sum += i;
                }
            }
        }
        System.out.println("Result is:" +sum);
    }
    public static boolean isPrime(int n){
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}