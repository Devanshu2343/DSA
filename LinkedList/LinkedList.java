public class LinkedList {
    public static class Node{
        int data ;
        Node next ;

        public Node(int data){
            this.data = data;
            this.next = null ;
        }
    }
    public static Node head ;
    public static Node tail ;
    //to get size -> java initially marks size = 0
    public static int size;
    
    // Function to add element at First
    public void addFirst (int data){
        //step 1 : create new node 
        Node newNode = new Node(data);
        size ++ ;
        if(head == null){
            head= tail = newNode;
            return ;
        }

        //step 2: newNode next = head
        newNode.next = head ;

        //step 3: head = newNode
        head = newNode;
    }

    // function to add element at Last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++ ;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    //function to print linkedlist
    public void print(){
        if(head == null){
            System.out.println("Linked list is empty");
            return ;
        }
        Node temp =head ;
        while (temp != null) {
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //function to add element in middle
    public void add (int idx , int data){
        if (idx==0){
            addFirst(data);
            return ;
        }
        Node newNode = new Node(data);
        size ++ ;
        Node temp = head ;
        int i =0 ;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        System.out.println(ll.size);
        ll.print();
        ll.addFirst(1);
        System.out.println(ll.size);
        ll.print();
        ll.addLast(3);
        System.out.println(ll.size);
        ll.print();
        ll.addLast(4);
        System.out.println(ll.size);
        ll.add(4,11 );
        ll.add(5,19 );
        ll.add(6,24 );
        ll.print();
        System.out.println(ll.size);
    }
}