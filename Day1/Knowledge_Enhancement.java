/* * 3. Knowledge_Enhancement
 * Alex is a high school student who loves reading and has a summer break coming up. 
 * He has a list of books he wants to read, with each book's estimated reading time stored in an array A. 
 * Alex has N hours available during the break for reading. 
 * Your task is to help Alex determine the maximum number of books he can read without exceeding his total available reading hours.
 * Input: The first line contains an integer hours, the number of hours Alex has available for reading.
 * The second line contains an integer n, the number of books in the list.
 * The third line contains n integers, each representing the reading time of a book in hours.
 * Output: The maximum number of books Alex can read without exceeding his available hours.
 */

import java.util.*;
public class Knowledge_Enhancement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int res = 0;
        for(int i = 0; i < n; i++) {
            if(hours >= arr[i]){
                hours -= arr[i];
                res++;
            }
            else{
                break;
            }
        }
        System.out.println(res);
    }
}
