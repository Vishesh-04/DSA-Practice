/*  27. Count the Number of Vowels in a String
 *  Write a function to count the number of vowels in a given string.
 */


import java.util.Scanner;
public class Count_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        sc.close();
        int res = count(s);
        System.out.println("Number of vowels in the string: " + res);
    }
    public static int count(String s){
        int c = 0;
        for(char i : s.toCharArray()){
            if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U' ){
                c++;
            }
        }
        return c;
    }
}