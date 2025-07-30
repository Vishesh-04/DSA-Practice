/* * 4. The_Distance
 * Jim has a password represented by a string S consisting of lowercase English letters (a-z) and digits (0-9). 
 * The distance between two characters is defined as the absolute difference between their indices in the string. 
 * Your task is to find and return the maximum distance between two non-similar characters within the given password S.
 */

import java.util.*;
class The_Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int res = 0;
        int h = n - 1, l = 0;
        while(l < h){
            if(s.charAt(l) != s.charAt(h)) {
                res = Math.max(res, h - l);
                break;
            }
            else if(s.charAt(l) == s.charAt(l+1)) {
                h--;
            }
            else{
                l++;
            }
        }
        System.out.println(res);
    }
}