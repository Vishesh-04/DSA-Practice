/*  21. Maximum Subarray Sum
 *  Problem: Given an integer array nums, 
 * find the subarray with the largest sum, 
 * and return its sum.
 */


import java.util.*;
public class Maximum_Subarray_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i : arr){
            sum = Math.max(i, sum + i);
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
}
