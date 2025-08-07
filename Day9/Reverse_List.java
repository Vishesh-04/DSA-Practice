/*  37. Reverse a Linked List
 *  Reverse a singly linked list.
 */


import java.util.*;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class Reverse_List {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(-1), curr = head;
        System.out.println("Enter the Number of Nodes");
        int n = sc.nextInt();
        while(n-- > 0){
            curr.next = new Node(sc.nextInt());
            curr = curr.next;
        }
        head = head.next;
        sc.close();
        head = reverse(head);
        curr = head;
        while(curr != null){
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.print("Null");
    }
    public static Node reverse(Node head){
        if(head == null){
            return null;
        }
        Node curr = head, prev = null, next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
