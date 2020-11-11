import java.util.*;
import java.io.*;
import java.lang.*;
class ArrayInsertOperation{
    public static void main(String[] args){
        int arr [] = new int[6];
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        //for displaying the element of an array element is
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        } 
    }
}