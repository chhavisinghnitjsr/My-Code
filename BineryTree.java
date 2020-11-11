import java.util.*;
import java.io.*;
class Node{
    int key;
    Node left,right;
    Node(int data){
        key = data;
        left = right = null;
    }
}
class BineryTreeOp{
  Node root;
  BineryTreeOp(int key){
    root = new Node(key);
  }
  BineryTreeOp(){
    root = null;
  }
  public static void main(String[] args){
    BineryTreeOp tree  = new BineryTreeOp();
    tree.root.left = new Node(1);
    tree.root.right = new Node(2);
    tree.root.left.left = new Node(3);
    tree.root.left.right = new Node(4);
    tree.root.left.right.left = new Node(5);
  
  } 
}