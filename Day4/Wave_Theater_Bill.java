/* 13. Wave Theater Bill
 * Problem: Vohra went to a movie with his friends in a Wave theater and during break time he bought pizzas, puffs and cool drinks. Consider the following prices:
 * •	Rs.100/pizza
 * •	Rs.20/puffs
 * •	Rs.10/cooldrink 
 * Generate a bill for what Vohra has bought.
 * Sample Input 1:
 * Enter the no of pizzas bought: 10
 * Enter the no of puffs bought: 12
 * Enter the no of cool drinks bought: 5
 * Sample Output 1:
 * No of pizzas: 10
 * No of puffs: 12
 * No of cooldrinks: 5
 * Total price=1290
 */


import java.util.*;
public class Wave_Theater_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of pizzas bought:");
        int piz = sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        int puf = sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        int cool = sc.nextInt();
        sc.close();
        int total = (piz * 100) + (puf * 20) + (cool * 10);
        System.out.println("No of pizzas bought: " + piz);
        System.out.println("No of puffs bought: " + puf);
        System.out.println("No of cool drinks bought: " + cool);
        System.out.println("Total bill: " + total);
    }
}
