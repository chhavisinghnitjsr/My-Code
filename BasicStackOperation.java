import java.util.*;
import java.io.*;
class BasicStackOperation{
    Integer top;
    //int static size;
    Integer i;
    //consturcture is useed for intiallised the object;
    //Default constructer;
     public static BasicStackOperation(){//100 address ofthis function through object reference;
        i = 10;
        top = -1;
        Integer size = 10;
        
    }
    //parametric constructer;
   public static  BasicStackOperation(int i){//200 address ofthis function through object reference;
        //stack;
        this.i = i;
    }
    public static void push(Stack<Integer>stack){
        //Stack<Integer> stack = new Stack<Integer>();
        int top;
        if(top == size-1){
            System.out.println("Stack is overflow");
            System.exit(1);
        }
        else{
            top++;
            top =stack.push(i);
        }
    }
    public static int pop(){
        //Stack<Integer> stack = new Stack<Integer>();
        int y =0;
        int top;
        if(top == -1){
            System.out.println("Stack is underflow");
            System.exit(1);
        }
        else{
           top--;
           y = stack.pop();
        }
        return y;
    }
    public static void main(String[] args){
        int element;
        Stack<Integer> stack = new Stack<Integer>();
        push(stack);
        push(stack);
        //show();
        pop();
        //show();
    }
}
