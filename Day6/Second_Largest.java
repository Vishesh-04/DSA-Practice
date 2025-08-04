/*  24. Find the Second Largest Number in an Array
 *  Write a function to find the second largest number in an array.
 */


import java.util.*;
public class Second_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        if (n < 2) {
            System.out.println("Array must contain at least two elements to find the second largest.");
            return;
        }
        secondLargest(arr);
    }
    public static void secondLargest(int arr[]){
        int l = Integer.MIN_VALUE, sl = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > l) {
                sl = l;
                l = i;
            } 
            else if (i < l && i > sl) {
                sl = i;
            }
        }
        System.out.println("The second largest element is: " + sl);
    }
}