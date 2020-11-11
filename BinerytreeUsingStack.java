import java.io.*;
import java.util.Stack;
import java.lang.*;

class Node{
    Node left,right;
    int key;
    Node(int data){
        key = data;
        left = right = null;
    }
}

class TreeTreversalUsingStack{
    //now we create stack
        Stack<Node> s = new Stack<Node>();

        public void TreeTreversal(Node root){
            Node curr  = root;
            while(curr != null){
                while(curr != null){
                    s.push(curr);
                    root = root.left;
                }//
                curr = s.pop();
                System.out.println(curr);
                //now we call the right hand side function;
                root = root.right;
            }
        }

    public static void main(String[]args){
        TreeTreversalUsingStack tree = new TreeTreversalUsingStack();
        tree.treeTreversal(4);
        tree.treeTreversal(5);
        tree.treeTreversal(6);
        tree.treeTreversal(7);
        tree.treeTreversal(8);

    }
}