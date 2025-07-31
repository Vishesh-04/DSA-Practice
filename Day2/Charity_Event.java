/* 5. Charity Event
 * You are organizing a charity event in a village, 
 * where you distribute chocolates to children sitting in a circle. 
 * While the distribution of chocolates follows a specific set of rules based on their position in the circle:
 * The ith child receives i chocolates. 
 * If a child's position is adjacent to a multiple of 5, 
 * they receive an additional 2 chocolates.
 * Given the number of children in circle, 
 * your task is to calculate and return an integer value representing the total number of chocolates distributed.
 * Note: Return mod of total to manage overflow with 1e9+7.
 */

import java.util.*;
public class Charity_Event {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 0;
        for(int i = 1; i <= n; i++){
            res += i;
            if(i == 1 && n % 5 == 0){
                res += 2;
            }
            else if(i > 1 && ((i - 1) % 5 == 0 || (i + 1) % 5 == 0)){
                res += 2;
            }
            res %= 1000000007;
        }
        System.out.println(res);
    }
}
