
import java.util.*;
public class LinkedListLength {

    public static class Node {
        int data ;
        Node next ;

         Node (int data){
            this.data = data ;
         }
    }

    public static int length (Node head){
        int count = 0 ;
        while (head != null){
            count ++ ;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node a = new Node(8);
        Node b = new Node(98);
        Node c = new Node (89);
        Node d = new Node (67);

        a.next =b;
        b.next = c;
        c.next = d; 
        
        int l = length(a);
        System.out.println(l);
 
        
    }
    
}
