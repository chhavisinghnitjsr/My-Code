import java.util.*;
import java.io.*;

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

class DiffLinkedlistIntersection
{
    Node head1 = null;
    Node head2  = null;
    void insertAtBegin1(int data)
    {
        if(head1 == null)
            head1 = new Node(data);
           
        else
        {
            Node temp1 = head1;
            temp1 = new Node(data);
            temp1.next = head1;
            head1 = temp1;
        }
    }

    void  insertAtBegin2(int data)
    {
        if(head2 == null)
            head2 = new Node(data);
        else
        {
            Node temp2 = head2;
            temp2 = new Node(data);
            temp2.next = head2;
            head2 = temp2;
        }
    }

    int  getList1Length()
    {
        int c1 = 0;
        if(head1 == null)
            return 0;
        else
        {
            Node temp1 = head1;
            while(temp1 != null)
            {
                temp1 = temp1.next;
                c1++;
            }
           // System.out.println("Linked List Length: "+c1);
        }
        return c1;
    }

    int  getList2Length()
    {
        int c2 = 0;
        if(head2 == null)
            return 0;
        else
        {
            Node temp2 = head2;
            while(temp2 != null)
            {
                temp2 = temp2.next;
                c2++;
            }
            
            //System.out.println("Linked List Length: "+c2);
        }
        return c2;
    }

    public void Display1()
    {
        if(head1 == null)
            return;
        else
        {
            Node temp1 = head1;
            while(temp1 != null)
            {
                System.out.print(temp1.data+"->");
                temp1 = temp1.next;
            }
        }
        System.out.println();
    }

    public void Display2()
    {
        if(head2 == null)
            return;
        else
        {
            Node temp2 = head2;
            while(temp2 != null)
            {
                System.out.print(temp2.data+"->");
                temp2 = temp2.next;
            }
        }
        System.out.println();
    }
      
    int getIntersection(int d, Node head1, Node head2)
    {
        //System.out.println("chhavi");
        Node temp1 = head1;
        Node temp2 = head2;
        if(head1 == null && head2 == null)
            return 0;
        else
        {
            while(temp1 != null && temp2 != null)
            {
                if(temp1 == temp2)
                    System.out.println("the Intersection point of the LinkedList is:"+temp1.data);
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        return temp1.data;
    }
    int getDifference()
    {
        int I1 = 0;
        int I2 = 0;
        int d1 = 0;
        int d2 = 0;
        int count1 = getList1Length();
        int count2 = getList2Length();
        if(count1 > count2)
        {
            d1 = count1-count2;
            I1 = getIntersection(d1,head1,head2);
            System.out.println(I1);
        }
        else if (count2 > count1)
        {
             d2 = count2-count1;
             I2 = getIntersection(d2,head1,head2);
             System.out.println(I2);
        }
        return 0;
        
    }

    public static void main(String args [])
    {
        DiffLinkedlistIntersection list = new DiffLinkedlistIntersection();
        list.insertAtBegin1(1);
        list.insertAtBegin1(5);
        list.insertAtBegin2(4);
        list.insertAtBegin2(5);
        list.insertAtBegin2(10);
        list.Display1();
        list.Display2();
        list.getList1Length();
        list.getList2Length();
       list.getDifference();
        
    }
}