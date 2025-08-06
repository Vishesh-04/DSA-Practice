/*  33. Binary Search
 *  Implement a binary search algorithm to find a target value in a sorted array.
 */


import java.util.*;
public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of Array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Element to be Searched");
        int x = sc.nextInt();
        int l = 0, h = n - 1, ind = -1;
        while(l <= h){
            int mid = (l + h) / 2;
            if(arr[mid] == x){
                ind = mid;
                break;
            }
            else if(arr[mid] < x){
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }
        if(ind != 0){
            System.out.println("The Element " + x + " is found at index : " + (ind + 1));
        }
        else{
            System.out.println("Element not found");
        }
        sc.close();
    }
}