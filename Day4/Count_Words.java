/*  15. Count Words
 *  Problem: Count the number of words in a string
 */

import java.util.*;

public class Count_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        sc.close();
        s = s.trim();
        String[] words = s.split(" ");
        int c = 0;
        for (String i : words) {
            if (!i.isEmpty()) {
                c++;
            }
        }
        System.out.println("Number of words: " + c);
    }
}