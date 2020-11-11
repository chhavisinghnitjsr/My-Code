import java.util.*;
import java.io.*;
import java.lang.*;

class ArrInsert{
    int size =5;
    int [] arr =new int [5];
    int index =0;

    public int [] insert(int element){ 
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
            index++;
        }
        System.out.println("index:  "+index);
        System.out.println("The insertion is end:  ");
        return arr;
    }

    public int [] insertPos(int pos, int element){
        System.out.println("Insert At Position is start:");
        /*
        if(pos < arr.length){
            System.out.println("The array when elelemnt inseerted is less then  arr.length"+arr.length);
            for(int i=index; i>0; i--){//2,
                System.out.println("The index is:  "+i);
                if(i >= pos){
                    arr[i] = arr[i-1];
                }
                System.out.println("The arr element is:  "+arr[i]);
                if(i == pos-1){
                    arr[i] = element;    
                }
                else{
                    if (i < (pos-1)){
                        arr[i] = arr[i];
                    }
                }
            }
            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
            return arr;
        }
*/
        System.out.println("inserted the element at pos when the pos   "+index);//5
        if((index-1) == arr.length-1){//5 ->5-1//
            System.out.println("inserted the element at pos when the pos is grater then arr.length: "+"index   "+index);
            int [] newArr = new int [arr.length+1];
            if(pos <= newArr.length){
            System.out.println(newArr.length);
            for(int i=0; i<newArr.length; i++){
                if(i < pos-1){
                    newArr[i] = arr[i];
                    System.out.println("newArr["+ i+"] = "+newArr[i]);
                }
                else if(i == pos-1){
                    newArr[i] = element;
                    System.out.println("newArr["+ i+"]= "+newArr[i]); 
                }
                else{
                    if(i >= pos){
                        newArr[i] = arr[i-1];
                        System.out.println("newArr["+ i+"]= "+newArr[i]); 
                    }
                }
            }

            for(int i=0; i<newArr.length; i++){
                System.out.println("newArr   "+"  [ "+i+"  ]     "+newArr[i]);
            }
            return newArr;
        }
        else if(pos > newArr.length){
            System.out.println("invalid condition");
        }
    }
    return arr;
    }
    
    public void display(){
        for(int i=0; i<index; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String [] args){
        int element=0;
        Scanner sc = new Scanner(System.in);
        //int arr[]= new int [size];
        int pos =0;
        /*for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
*/
        //int pos = sc.nextInt();
        ArrInsert obj = new ArrInsert();
        obj.insert(element);
        //obj.display();
        pos = sc.nextInt();
        element = sc.nextInt();
        obj.insertPos(pos,element);
        //obj.display();
    }
}