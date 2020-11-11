import java.util.*; 
import java.lang.*;
class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
        next = null;
    }
}
class CircularLinkedList
{
    Node head;
    void insertAtEnd(int data)
    {
        if(head == null)
        {
            head = new Node(data);
        }
        else
        {
            Node temp = head;
            while(temp != null)
            {
                temp = temp.next;
            }
            temp = new Node(data);
            System.out.println(temp.data);
        }
    }
    public void display()
    {
        if(head == null)
        {
            System.out.println("not any data will found in the list");
        }
        else
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
     }
    public static void main(String args)
    {
        
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
    }
}