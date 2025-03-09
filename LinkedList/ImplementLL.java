
import java.util.*;
public class ImplementLL{
    public static class Node{
        int data ;
        Node next ;
        Node (int data){
            this.data =data ;
            this.next = null ;
        }
    } 

    public static class linkedlist {
        Node head = null ;
        Node tail = null ;

        void insertAtEnd (int data){
            Node temp = new Node (data);
            if (head == null){
                 head = temp ;
            }
            else {
                tail.next = temp ;
            }
             tail = temp ;

        }

        void display (){
            Node temp = head ;
            while (temp != null){
                System.out.print(temp.data + "->");
                temp =temp.next;
            }
        }

        int size (){
            int count =0 ;
            Node temp = head ;
            while (temp != null){
                count++;
                temp = temp.next;
            }
            return count ;
        }
    
        
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(9); // 9
        ll.insertAtEnd(89); // 9 -> 89
        ll.display();
        System.out.println();
        System.out.println(ll.size());
        ll.insertAtEnd(78); // 9 -> 89 ->78
        ll.insertAtEnd(45); // 9 -> 89 ->78 -> 45
        ll.display();
        System.out.println();
        System.out.println(ll.size());
    }
    
}
