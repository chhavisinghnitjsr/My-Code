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
  int key;
  BineryTreeOp(int key){
    root = new Node(key);
  }
  BineryTreeOp(){
    root = null;
  }
  /*
  public void display(){
     
      while(root.left == null && root.right == null){
          System.out.println(BineryTreeOp(key));
      }
    }
    */
    public static void main(String[] args){
      int level =3;
    BineryTreeOp tree  = new BineryTreeOp(3);
    tree.root = new Node(6);
    tree.root.left = new Node(1);
    tree.root.right = new Node(2);
    tree.root.left.left = new Node(3);
    tree.root.left.right = new Node(4);
    tree.root.left.right.left = new Node(5);
  
  } 
}