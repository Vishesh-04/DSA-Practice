/* 2. Magical Library
 *  In a Magical Library, each row represents a shelf of books, and each book has a series value on it.
 *  Buy Best Selling books online.
 *  A row is considered magical if the sum of the odd values of the series even.
 *  Your task is to find the number of magical rows in the library.
 */

import java.util.*;
public class Magical_Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int res = 0;
        for(int i[] : arr){
            int sum = 0;
            for(int j : i){
                if(j % 2 == 1){
                    sum += j;
                }
            }
            if(sum % 2 == 0 && sum != 0){
                res++;
            }
        }
        System.out.println(res);
    }
}
