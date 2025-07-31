/* * 6. Red Pen Green Pen
 * You are a teacher creating an engaging math activity for your students by writing N numbers on the classroom whiteboard. 
 * You use a green pen for odd numbers and a red pen for even numbers. 
 * Your task is to find and return an integer value representing the number of times 
 * you need to switch from the green pen to the red pen while writing these numbers.
 */


import java.util.*;
public class Red_Pen_Green_Pen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        char c;
        if(arr[0] % 2 == 0){
            c = 'R';
        } 
        else {
            c = 'G';
        }
        int res = 0;
        for(int i = 1; i < n; i++){
            if(c == 'G'){
                if(arr[i] % 2 == 1){
                    continue;
                }
                else{
                    c = 'R';
                    res++;
                }
            }
            else{
                if(arr[i] % 2 == 0){
                    continue;
                }
                else{
                    c = 'G';
                }
            }
        }
        System.out.println(res);
    }
}
