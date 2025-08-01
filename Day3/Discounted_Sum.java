/*  11. Discounted Sum
 * Problem: You are given an array of integers and an integer n. 
 * Your task is to find the sum of the first n largest unique elements from the array. 
 * Subtract the largest element (from those n elements) from the sum (this is called a discount). 
 * Finally, return the result after applying the discount.
 */


import java.util.*;
public class Discounted_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int m = sc.nextInt();
        int[] arr = new int[m];
        System.out.println("Enter the elements:");
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        if(n == 1){
            System.out.println(1);
        }
        ArrayList<Integer> ar = new ArrayList<>();
        Arrays.sort(arr);
        int sum = 0;
        for(int i = m - 1; i >= 0; i--){
            if(!ar.contains(arr[i])){
                ar.add(arr[i]);
            }
            else{
                ar.remove((Integer) arr[i]);
            }
        }
        for(int i = 0; i < n; i++){
            sum += ar.get(i);
        }
        System.out.println(sum - ar.get(0));
        sc.close();
    }
}
