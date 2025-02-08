import java.util.ArrayList;
import java.util.Stack;
import java.util.*;

public class ImplemenTree {
    public static class Node {
        int val;
        ArrayList<Node> child;

        public Node(int x) {
            this.val = x;
            this.child = new ArrayList<>();
        }
    }

    public static Node Construct(int[] nums) {
        Node root = null;
        Stack<Node> st = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -1) {
                st.pop();
            } else {
                Node node = new Node(nums[i]);
                if (st.size()>0) {
                    Node topNode =st.peek();
                    topNode.child.add(node);
                    st.push(node);
                } else {
                    root = node;
                    st.push(node);
                }
            }
        }
        
        return root;
    }

    private static void display(Node root) {
        if (root == null) return;

       String s = root.val + "->" ;
       for (Node node : root.child){
            s = s+ node.val + "->" ;
       }
       s += "." ;
       System.out.println(s);
       for(Node nd : root.child){
        display(nd);
       }
    }


        private static int maxVal(Node root) {
            int max = Integer.MIN_VALUE;
         
            for (Node nd : root.child) {
                int x = maxVal(nd);
                max = Math.max(x, max);
            }
            max = Math.max(root.val, max);
            return max;
        }
        
    

    public static void main(String[] args) {
        int[] nums = {5,6,9,-1,-1,7,10,-1,11,-1,12,-1,-1,8,13,14,11,-1,-1,-1,-1,-1};
        Node root = Construct(nums);
        System.out.println("Tree Structure:");
        display(root);
        System.out.println(maxVal(root));
    }
}
