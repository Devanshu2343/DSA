import java.util.*;
public class DisplayLL {
    public static class Node {
        int data ;
        Node next ;
         
        Node(int data){
            this.data = data;
            this.next= null ;
        }
        
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next= b; //1-> 2 3 4
        b.next=c; //1-> 2 -> 3 4
        c.next=d;  //1-> 2 -> 3 -> 4

        //using for loop
        // Node temp = a;
        // for (int i =0 ; i < 4 ;i++){
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }

        //using while loop 
        Node temp = a;
        while (temp != null) {
            System.out.print(temp.data + "->" );
            temp = temp.next;
        }

        
    }
    
}
