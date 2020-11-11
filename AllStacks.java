import java.util.*;
import java.io.*;
import java.lang.*;
class AllStacks{
    int top;
    int capacity;
    int size;
    int arr[];
    //here we make constructer for intilize the  variable;
    AllStacks(int size){
        //int top = -1;
        arr = new int[size];
        int top = -1;
        int capacity = size; //arr name is a pointer for itself;;
    }
    int push(int i){
        if(top == capacity-1){
            System.out.println("Stack is overflow");
        }
        arr[++top] = arr[i];
        top = arr[top];
        return top;  
    }
    void display(){
        for(int i = top; i > -1; --i){
            if(top == -1){
                System.out.println("stack is empty");
            }
            else{
                arr[i] = push(i);
                System.out.println(arr[i]);
            }
        }
    }
    /*
    int pop(){
        int i = 0;
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            int x = arr[--top];
        }
        System.out.println(x);
    }
    */
    public static void main(String [] args){
        AllStacks stackObj = new AllStacks(5);
        stackObj.push(1);
        stackObj.push(6);
        stackObj.push(5);
        stackObj.display();
        stackObj.pop();
        stackObj.pop();
        StackObj.display();
    }
}