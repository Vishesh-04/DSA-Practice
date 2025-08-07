/*  35. Find the Missing Number in an Array
 *  Given an array of numbers from 1 to n with one missing number, 
 *  Write a program to find the missing number.
 */


import java.util.*;
public class Missing_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        if(arr[0] != 1){
            System.out.println("Result = " + 1);
        }
        else{
            int res = n + 1;
            for(int i = 1; i < n; i++){
                if(arr[i - 1] + 1 != arr[i]){
                    res = arr[i - 1] + 1;
                    break;
                }
            }
            System.out.println("Result = " + res);
        }
        sc.close();
    }
}