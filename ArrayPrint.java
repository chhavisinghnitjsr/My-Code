import java.io.*;
import java.lang.*;
import java.util.*;

public class ArrayPrint{
    public static int [] getArray(int arr[],int element){
        int [] newArr = new int [arr.length+1]; 
        int j =0;
        for(int i=0; i<arr.length; i++){
            if(i == 0){
                newArr[0] = element;
            }
            newArr[i] = arr[j];
            j++;
        }

       // for(int i=0; i<newArr.length; i++){
         //   System.out.println(newArr[i]);
        //}
        return newArr;
    }
    public static void main(String[] args){
        int arr [] = new int[3];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        //int retArr[];//when you type the name of an array then we create the address referance;
        //as supposde that we create the address will be 2000;
        int retArr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();


         // 'new' only allocate the address for array in heap area;
        // and also new is also a address referance veriable that means it keep the address of an object;
        //retArr = new ArrayPrint();
        //Arrays.toString();//it is also the way by which we display the array; 
        //that means the new keyword ma23ke the memory at 3000 place
        //new keyWord create the memory at the runtime;
        System.out.println("coming array" + getArray(arr,element));//herewe print the address of the coming array;
        for(int i=0; i<retArr.length; i++){
            retArr = getArray(arr,element);//it return the address of an array;
            System.out.println("The returnable array is: "+retArr[i]);
        }
    }
}