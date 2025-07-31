/*  8. Generated Numbers
 * Problem: You have a jar that initially contains N marbles. 
 * You can perform the following operations in any order and any number of times:
 * •	Remove A marbles from the jar.
 * •	Remove B marbles from the jar.
 * Your task is to find and return the number of unique positive 
 * values that can represent the number of marbles left in the jar 
 * after performing these operations. The initial number of marbles N 
 * should also be included in the count of unique values.
 * Note: The jar should never become empty during the operations.
 */

import java.util.*;
public class Generated_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> ar = new HashSet<>();
        st.push(n);
        while(!st.isEmpty()){
            int c = st.pop();
            ar.add(c);
            if((c - a) > 0){
                st.push(c - a);
            }
            if((c - b) > 0){
                st.push(c - b);
            }
        }
        System.out.println(ar);
    }
}
