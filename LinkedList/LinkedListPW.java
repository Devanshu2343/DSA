import java.util.*;
public class LinkedListPW {
    public static class Node {
        int data ;
        Node next ;
         
        Node(int data){
            this.data = data;
            // this.next= NULL ;
        }
        
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        System.out.println(a);
        System.out.println(a.data);
        System.out.println(a.next);
        a.next= b; //1-> 2 3 4
        b.next=c; //1-> 2 -> 3 4
        c.next=d;  //1-> 2 -> 3 -> 4

        System.out.println(a);
        System.out.println(a.data);
        System.out.println(a.next);
    }
    
}
