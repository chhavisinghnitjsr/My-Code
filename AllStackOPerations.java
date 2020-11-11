import java.util.*;
import java.io.*;
import java.util.*;
class AllStacks{
    int top;
    int capacity;
    int size;
    //here we make constructer for intilize the  variable;
    AllStackOperations(int size){
        int capacity = size;
        arr[] = new int [size]; 
        top = -1;
    };
    void push(int i){
        if(top == capacity-1){
            System.out.println("Stack is overflow");
        }
        arr[++top] = i;
    }
    void display(){
        if(top == 0){
            System.out.println("stack is empty");
        }
        else{
            for(int i = top; i > -1; i--){
                System.out.println(i);
            }
        }
    }
    public static void main(String [] args){
        Stack stackObj = new Stack();
        StackObj.Push(1);
        StackObj.push(2);
        StackObj.push(3);
        StackObj.display();
       // StackObj.pop();
        //stackObj.pop();
        //StackObj.display();
    }
}