import java.util.*;
import java.io.*;
import java.lang.*;
class Node 
{
    int data;
    Node next;
    Node prev;
    public Node(int data)
    {
        this.data = data;
        next = null;
    }   
}
class DoublyLinkedList
{
    Node head;
    void insertAtBeg(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = new Node(data);
        }
        else
        {
            Node temp = head;
            newNode.next = head;
            newNode.prev = null;
            temp = temp.next;
        }
    }
    void insertAtEnd(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
           // System.out.println("chhavi");
            head = new Node(data);
        }
        else
        {
            //System.out.println("chhavi");
            Node temp = head;
            while(temp != null)
            {
                newNode.next = head;
                newNode.prev = temp;
                temp = temp.next;
            }
            temp = new Node(data);
        }
    }
    public void display()
    {
        if(head == null)
            return;
        else
        {
            Node  temp = head;
            while(temp != null)
            {
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
        }
        System.out.println();
    }
    public static void main(String [] args)
    {
        DoublyLinkedList list = new DoublyLinkedList();
        list.display();
        list.insertAtBeg(1);
        list.insertAtBeg(2);
        list.insertAtBeg(3);
        list.insertAtBeg(4);
        list.insertAtBeg(5);
        list.display();
    }
}