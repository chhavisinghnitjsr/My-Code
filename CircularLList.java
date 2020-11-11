import java.util.*;
import java.io.*;~
import java.util.*;
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
class CircularLList
{
    Node head;
    void insertAtBegin(int data)
    {
        if(head == null)
        {
            head = new Node(data);
        }
        else
        {
            Node temp;
            temp = new Node(data);
            temp.next = head;
            head = temp;
            
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
    public Node circularLinkedList()
    {
        if(head == null)
        {
            System.out.println("list is not possible");
        }
        else
        {
            Node temp = head;
            if(head == null)
            {
                return;
            }
            if(head != null)
            {
                while(temp != head)
                {
                    temp = temp.next;
                }
            }
            if(temp.next == head);
                   System.out.println("The given List is Circular LinkedList");
            else
                    System.out.println("The given List is  not a Circular LinkedList");
        }
        return head;

   }
    public static void main(String[] args)
    {
        CircularLList list = new CircularLList(); 
        list.insertAtBegin(1);
        list.insertAtBegin(2);
        list.insertAtBegin(3);
        list.insertAtBegin(4);
        list.circularLinkedList();
        list.display();
    }

}