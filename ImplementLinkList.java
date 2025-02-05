public class ImplementLinkList {
    class Node {
        int data ;
        Node next ;
    }
    class ListNode{
        Node first ;
        Node last ;
        int size ;
    }
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.addFirst(0));
        
    }
    
    public void addFirst(int val) {
        Node node = new Node(val);
        if (size > 0) {
            node.next = first;
            first = node;
        } else {
            first = node;
            last = node;
        }
        size++;
    }
    public void deleteFirst(int n ){
        if (size > 0 ){
            first = first.next ;
            size --;
        }else {
            System.out.println("List is alrready empty");
        }
    }
    public void addLast(int x){
        Node node= new node (x);
        if(size>o){
            last.next = node ;
            last = node;
        }
        else{
            first = node;
            last =node ;
            
        }
    public void deleteLast(){
        if(size ==0) {
            System.out.println("List is empty");
        } else if(size ==1){
            t = null;
            l=null;
            size --;
        }  else {
            Node temp = new Node(0);
            temp.next =first ;
            while(temp.next!=last){
                temp = temp.next;
            }
             temp.next = null;
             size --;
        }

    } 
    public Node getNode(int index){
        if(index<0 || index>size){

        }
        else {
            Node temp = first ;
            while(index>1){
                temp=temp.nwxt;
            }
            return temp;
        }
    }
}
