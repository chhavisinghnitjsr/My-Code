import java.util.*;
import java.lang.*;
import java.io.*;

class DIStringMatch{ 
    public int [] diStringMatch(String S){
        char ch[] = S.toCharArray();
        int arr[] =new int [ch.length+1];
        //int ch1[] =new int [ch.length+1];
        int max =ch.length;
        int min =0;
        for(int i=0; i< ch.length; i++){
            //if(max>=0 && min<=max){
                if(ch[i] == 'I'){
                    arr[i] = min;
                    min++;
                    //System.out.println(min);
                }
                else{
                    arr[i] = max;
                    max--;
                    //System.out.println(max);
                }
           // }
        }
            
            arr[arr.length-1] = max;
            System.out.println(arr);
    
            for(int i =0;i<arr.length;i++){
                
                System.out.println(arr[i]);
            }
        return arr;
    }
    public static void main(String [] args){
        String S = "DIDI";
       // int arr[] =new int [ch.length+1];
        DIStringMatch obj = new DIStringMatch();
        System.out.println(obj.diStringMatch(S));    
    } 
}