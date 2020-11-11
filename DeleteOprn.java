import java.util.*;
import java.io.*;
import java.lang.*;

class DeleteOprn{
    int index = 0;
    int [] arr = new int [a;
    public int insert(int element){
        arr[index] = element;
        index++
    }
    public int [] deleteBeg(int arr[],int index){
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i+1];
            System.out.println(arr[i]);
        }
        return arr;
    }

    public int [] deleteEnd(int arr[],int size,int index){
        // we provide the service of the array,Therefore we only 
        //display the element for user,this is not took any effect if 
        // at tenth position we put any element; 
        //here we provide loop for display the element;
        //this loop for displaying the element;
        if(index == 0)
            return arr;
        index--;
    }
    
    public int [] deletePos(int arr[],int pos,int size){ 
        //Scanner sc = new Scanner(System.in);
        //int pos = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(i < pos){
                arr[i] = arr[i];
            }
            if(i >= pos-1){
                arr[i] = arr[i+1];
            }
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void main(String [] args){
        //int arr [] = new int[];
        int size =4;
        Scanner sc = new Scanner(System.in); 
        int arr [] = new int[size];
        for(int i=0; i<size;i++){
            arr[i]  = sc.nextInt();
        }

        //Scanner sc = new Scanner(System.in);
        //int size = sc.nextInt();
        //int pos = sc.nextInt();
        
        DeleteOprn obj = new DeleteOprn();
        //obj.deleteBeg(arr,size);
       //obj.deletePos(arr,size,pos);
        //obj.deleteEnd(arr,size);
        //Scanner sc = new Scanner(System.in);
        int ch ;
        do{
            System.out.println("please enter your choice");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    obj.deleteBeg(arr,size);
                    break;
                case 2:
                    System.out.println("enter the pos");
                    int pos = sc.nextInt();
                    obj.deletePos(arr,size,pos); 
                    break; 
                case 3:
                    obj.deleteEnd(arr,size); 
                    break;
                case 4: 
                    System.exit(0); 
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }while(ch <5);   
    }
}