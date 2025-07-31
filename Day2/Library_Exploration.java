/* 7. Library Exploration
 * There is a library having N shelves in it. 
 * Each shelf is labeled from 1 to N and is stocked with A[i] books on each shelf. 
 * You have to select books only from shelves that have prime-numbered labels. 
 * Additionally, there is a limit of K books that you can select from each shelf.
 * Your task is to find and return an integer value representing 
 * the maximum number of books you can collect during a single visit to the library.
 * Note: Assume 1-based indexing.
 */

import java.util.*;
public class Library_Exploration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(), res = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(isPrime(i + 1)){
                res += Math.min(arr[i], k);
            }
        }
        System.out.println(res);
    }
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
