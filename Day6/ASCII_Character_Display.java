/*  23. ASCII Character Display
 *  Problem: Ritik wants a magic board that displays a character for a corresponding number for his science project. 
 *  Develop an application that converts given numbers to their corresponding characters. 
 *  Example: When the digits 65, 66, 67, 68 are entered, the alphabet A, B, C, D should be displayed.
 */


import java.util.*;
public class ASCII_Character_Display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        sc.close();
        if(n < 0 || n > 127){
            System.out.println("Please enter a number between 0 and 127.");
        }
        else{
            char i = (char)n;
            System.out.println(n + " - " + i);
        }
    }
}