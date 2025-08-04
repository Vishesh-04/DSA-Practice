/*  25. Merge Two Sorted Arrays
 *  Write a function to merge two sorted arrays into one sorted array.
 */


import java.util.*;
public class Merge_Two_Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter size of second array:");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();
        int[] res = merge(arr1, n1, arr2, n2);
        for(int i = 0; i < n1 + n2; i++){
            System.out.print(res[i]);
            if(i < n1 + n2 - 1) {
                System.out.print(", ");
            }
        }
    }
    public static int[] merge(int arr1[], int n1, int arr2[], int n2){
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