/* 1. Minimum Sum 
 * In this we are given 2 array and we have to swap variables within the Array to make sure that the sum of a[i]*b[i] is minimized.
 */


import java.util.Scanner;
import java.util.Arrays;
public class Min_Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];        
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }        
        for(int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }        
        Arrays.sort(a);
        Arrays.sort(b);
        
        long sum = 0;
        for(int i = 0; i < n; i++) {
            sum += (long)a[i] * b[n - 1 - i];
        }        
        System.out.println(sum);
    }
}