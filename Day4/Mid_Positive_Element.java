/*  17. Mid_Positive_Element.java
 *  Problem: Find the middle positive element in a given array.
 */


import java.util.*;
public class Mid_Positive_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > 0) {
                ar.add(arr[i]);
            }
        }
        sc.close();
        n = ar.size();
        Collections.sort(ar);
        if (n == 0) {
            System.out.println("No positive Elements");
        } 
        else {
            if (n % 2 == 0) {
                System.out.println("Mid Positive Element is: " + ar.get(n / 2 - 1));
            } 
            else {
                System.out.println("Mid Positive Element is: " + ar.get(n / 2));
            }
        }
    }
}