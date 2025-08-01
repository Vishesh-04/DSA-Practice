/*  10. Sort String
 * Problem: You are a librarian in a bustling library where books are arranged in a single line, 
 * each represented by a letter from A to Z. 
 * One day in a hurry you mistakenly arranged some books out of order. 
 * Given a string S of length N representing the books, 
 * your task is to find and return an integer value representing the minimum number of books 
 * (indices in the string) that need to be moved to sort the row alphabetically.
 */


import java.util.*;
public class Sort_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        sc.close();
        List<Integer> ar = new ArrayList<>();
        for(char i : s.toCharArray()){
            int p = Collections.binarySearch(ar, (int)i);
            if(p < 0){
                p = -(p + 1);
            }
            if(p == ar.size()){
                ar.add((int) i);
            }
            else{
                ar.set(p, (int) i);
            }
        }
        System.out.println(ar.size());
        sc.close();
    }
}
