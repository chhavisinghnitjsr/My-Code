import java.lang.*;
import java.io.*;
import java.util.*;

class BasicArray{
    public int [] insertAtBeg(int arr[], int size, int element){
        int newArr [] = new int [size+1];
        int j=0;
        for(int i=0; i<size; i++){
            newArr[0] = element;
            newArr[i] = arr[j];
            j++;
        }
        
        for(int k=0; k<newArr.length; k++){
            System.out.println(newArr[i]);
        }
        
        return newArr;    
    }

    public int[] insertAtPos(int [] arr, int pos, int size, int element){
        //int [] newArrr;
        int [] newArr = new int[size+1];
        for(int i=; i>pos; i++){
            if(i =  pos-1){
                newArr[i] = arr[i-1];
            }
            else if(i == pos-1){
                newArr[i] = element;
            }
            else{
                newArr[i] = arr[i-1];
            }
        }  
        return newArr;  
    }

    public int [] insertAtEnd(int [] arr, int size, int element){
        int [] newArr = new int[size+1];
        for(int i=0; i<newArr.length; i++){
            if(i == arr.length-1){ //There is an error raise;
               newArr[i] = element;                
            }
        } 
        return newArr;  
    }

    public int [] deleteAtBeg(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        return arr;
    }

    public int [] deleteAtPos(int arr[],int pos){
        for(int i=0; i<arr.length-1; i++){
            if(i >= pos){
                arr[i] = arr[i+1];
            }
            else{
                continue;
            }
        }
        return arr;
    }

    public int [] deleteAtEnd(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(i == arr.length-2){
                arr[arr.length-1] = arr[arr.length-2];
            }
            else{
                continue;
            }
        }
        return arr;
    }

    public int searchElement(int arr[], int element){
        if(arr.length == -1){
            return 0;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return 0;
    }

    public static void main(String [] args){
        int [] arr;//here we declare the array;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Insert the element is:");
        int element = sc.nextInt();
        System.out.println("For displainong the element is");
        for(int i=0; i<arr.length; i++){
            System.out.println("****"+arr[i]);
        }
        System.out.println("After the following Array operation is: ");
        BasicArray obj = new BasicArray();
        obj.insertAtBeg(arr,size,element);
        obj.insertAtPos(arr,size,2,element);
        obj.insertAtEnd(arr,size,element);
        

        int retarr[];
        retarr = obj.insertAtBeg(arr,size,element);

        System.out.println("insert element at beg: " + obj.insertAtBeg(arr,size,element));
        System.out.println("insert element at pos: "+obj.insertAtPos(arr,size,2,element));
        System.out.println("insert element at end: "+obj.insertAtEnd(arr,size,element));
        System.out.println("Delete Element at Beg: "+obj.deleteAtBeg(arr));
        System.out.println("Delete Element at pos: "+obj.deleteAtPos(arr,15));
        System.out.println("Delete element at End: "+obj.deleteAtEnd(arr));
        System.out.println("Search element in array: "+obj.searchElement(arr,5));
    }
}
         //Array is continious memory location so we donot insert the element at the 
        //end of the array,at the middle of the array,
        //Enter the element is not possible in array bcz array is continious memory location,
        //we do this work at arraylist;
        //Also we donot delete the element from middle,begining,end
         //insert the element at the begining of the array