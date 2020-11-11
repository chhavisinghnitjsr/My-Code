import java.util.*;
import java.io.*;
import java.lang.*;
class ArrayWithStacks{
    static int top;
    static int arr[];
    static int size;
    static int capacity;
    ArrayWithStacks(int size){
        top = -1;
        int capacity;
        capacity = size;
        arr = new int [capacity];
    }
    public static int push(int arr[], int i){
        int top = -1;
        int j =0;
        for(top = 0; top > -1 && top<size; top++){
            //if(top >= -1){
               // System.out.println("chhavi  "+arr[0]);
                top = arr[j];
                i = arr[top];
                i++;
                j++;
            
           // else{
                if(top == size-1)
                    System.out.println("stack is overflow");
           // }
        }
        return i;
    }
    public  static void display(ArrayWithStacks s, int i,int n){
       
            int top = n-1;
            top = s.push(arr,i);
            //System.out.println(s.push(arr,i));
            for(i = top; i > -1; i--){
                arr[i] = top;
                System.out.println("chhavi "+s.push(arr,i));
            }
            if(top == -1){
                System.out.println(" push is not possible");
            }
        
    }
    public static void main(String [] args){
        int arr[] = {2,1,4,3,6,8};
        int n = arr.length;
        ArrayWithStacks stk = new ArrayWithStacks(10);
        stk.push(arr,1);
        stk.push(arr,2);
        stk.push(arr,3);
        stk.display(stk,1,n);
    }
}