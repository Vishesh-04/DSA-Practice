/*  9. Cryptographer
 *  An ancient journal was found containing an encrypted message. 
 * The encryption used in the journal shifts each character one position forward in the alphabet. 
 * For example 'a' becomes 'b', 'b' becomes 'c', and so on. However, 'z' wraps around and becomes 'a'. 
 * Alex, a cryptographer, needs to decrypt this journal by reversing the shift. 
 * Your task is to return the decrypted string by shifting each character one position back in the alphabet. 
 * For example:
 * •	The letter 'b' becomes 'a', 'c' becomes 'b', and so on.
 * •	If the letter is 'a', it becomes 'z'.
 * Note: The journal contains only lowercase English letters.
 */

import java.util.*;
public class Cryptographer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        StringBuffer sb = new StringBuffer();
        for(char i : s.toCharArray()){
            if(i > 'a' && i <= 'z'){
                sb.append((char)(i - 1));
            }
            else{
                sb.append('z');
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
