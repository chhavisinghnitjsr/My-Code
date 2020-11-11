import java.util.*;
import java.io.*;
import java.lang.*;

class DIAStringMatch{
    public int [] diString(String S){
        int N =S.length();
        int count =N+1;
        int arr[] =new int [N+1];
        int max =S.length();
        int min =0;
        int j=0;

            for(int i=0; i< N; i++){                
                if(S.charAt(i) == 'I'){
                    arr[j] = arr[i]+max;
                    System.out.println(arr[j]);
                    max--;
                }
                else{
                arr[j] = arr[i]+min;
                System.out.println(arr[j]);
                min++;
            }
            j++;
        }
        arr[j] = min;  
        System.out.println(arr[j]);
       
        return arr;
    }
    
    public static void main(String [] args){
        String S="IDID";
        DIAStringMatch obj = new DIAStringMatch();
        System.out.println(obj.diString(S));
    }
}