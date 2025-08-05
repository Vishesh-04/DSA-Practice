/*  30: Check if a Number is Prime
 *  Write a function to check if a given number is prime.
 */


import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        sc.close();
        if(isPrime(num)){
            System.out.println(num + " is a Prime Number");
        }
        else{
            System.out.println(num + " is not a Prime Number");
        }
    }
    public static boolean isPrime(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if((num % i) == 0){
                return false;
            }
        }
        return true;
    }
}