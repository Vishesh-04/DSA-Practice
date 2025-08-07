/*  38. Median of Two Sorted Arrays
 *  Find the median of two sorted arrays.
 */


import java.util.*;
public class Median_Two_Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of 1st Array");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter Element of Array 1");
        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the Size of 2nd Array");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter Element of Array 2");
        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }
        sc.close();
        int arr[] = merge(arr1, n1, arr2, n2);
        for(int i : arr){
            System.out.println(i);
        }
        int n = arr.length;
        if (n % 2 == 0) {
            System.out.println((arr[n / 2 - 1] + arr[(n / 2)]) / 2.0);
        } 
        else {
            System.out.println((double) arr[(int) Math.floor((n + 1) / 2) - 1]);
        }
    }
    public static int[] merge(int arr1[], int n1, int arr2[], int n2) {
        int i = 0, j = 0, k = 0;
        int res[] = new int[n1 + n2];
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                i++;
            } 
            else {
                res[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            res[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            res[k] = arr2[j];
            j++;
            k++;
        }
        return res;
    }
}