/*  19. Count Valid Subarrays of Size 3
 * Problem: You are given an array of integers containing N elements. 
 * Your task is to find and return an integer value representing the total number of subarrays of size 3 
 * where the sum of the first element and the third element is equal to the second element.
 * A subarray is a continuous sequence of elements in an array.
 */


import java.util.*;
public class Count_Valid_Subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        if (n < 3) {
            System.out.println(0);
            return;
        }
        int res = 0;
        for (int i = 0; i <= n - 3; i++) {
            int a = arr[i] + arr[i + 2];
            if (a == arr[i + 1]) {
                res++;
            }
        }
        System.out.println(res);
    }
}