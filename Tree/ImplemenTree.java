import java.util.ArrayList;
import java.util.Stack;

import javax.swing.tree.TreeNode;

import java.util.*;

public class ImplemenTree {
    public static class Node {
        int val;
        ArrayList<Node> child;

        public Node(int val) {
            this.val = val;
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
                if (!st.isEmpty()) {
                    st.peek().child.add(node);
                } else {
                    root = node;
                }
                st.push(node);
            }
        }
        return root;
    }

    public static void display(Node root) {
        if (root == null) return;

       String s = root.val + "->" ;
       for (Node node : root.child){
        s += node.val + "->" ;
       }
       s += "." ;
       System.out.println(s);
       for(Node nd : root.child){
        display(nd);
       }
    }

   



        public static int max(Node root) {
            int max = Integer.MIN_VALUE;
            for (Node nd : root.child) {
                int x = max(nd);
                max = Math.max(x, max);
            }
            return Math.max(root.val, max);
        }
        
    

    public static void main(String[] args) {
        int[] nums = {20,2,100,-1,-1,5,30,-1,50,-1,70,5,-1,-1,-1,140,7,200,-1,-1,-1,-1};
        Node root = Construct(nums);
        System.out.println("Tree Structure:");
        display(root);
    }
}
