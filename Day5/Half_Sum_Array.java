/*  18. Half Sum Array
 *  Problem: Write a program that checks whether the sum of the first half of an array is less than the sum of the second half. 
 *  If this condition is met, the program should reverse the entire array. 
 *  Finally, the program should print the resulting array.
 */


import java.util.*;
public class Half_Sum_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), mid = n / 2, s1 = 0, s2 = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(i < mid){
                s1 += arr[i];
            }
            else{
                s2 += arr[i];
            }
        }
        sc.close();
        if(s1 == s2){
            for(int i = 0; i < mid; i++){
                int t = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = t;
            }
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
        }
        else{
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}