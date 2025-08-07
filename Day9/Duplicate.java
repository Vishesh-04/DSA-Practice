/*  36. Find All Duplicates in an Array
 *  Given an array of integers where each element may appear twice or more, 
 *  find all the duplicate elements.
 */


import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i : arr){
            if(hs.contains(i) && !ar.contains(i)){
                ar.add(i);
            }
            else{
                hs.add(i);
            }
        }
        System.out.println("The Non-Duplicates Numbers are : ");
        for(int i : ar){
            System.out.print(i + ", ");
        }
        sc.close();
    }
}