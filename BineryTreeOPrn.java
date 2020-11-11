import java.util.*;
import java.io.*;

class Node{
    int key;
    Node root;
    Node left;
    Node right;
    int size;
    //parametric constructer;
    Node(int data){
        key = data;
        left = right = null;
    }
}
class  BineryTreeOprn{
    Node root;
    BineryTreeOprn(int data){
        Node root;
        root = new Node(data);
    }

    public static void main(String [] args){
        BineryTreeOprn tree = new BineryTreeOprn();~
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.left.right = new Node(5);

    }
}