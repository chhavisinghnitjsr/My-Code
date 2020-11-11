import java.util.*;
import java.lang.*;
import java.io.*;
class DuplicateArray{
    public void duplicateArray(int arr[], int n){
        int i=0;
        //int count = 0;
        for(i=1; i<n; i++){//1,
           int  count =0;
            for(int j=i-1; j<n; j++){//j= 1-1 =0, 
                if(arr[i] != arr[j]){
                    count++;
                    //System.out.println(arr[i] +"  "+count);
                }     
            }
            System.out.println(arr[i] +"  "+count);         
        }    
    }
    public static void main(String [] args){
        int arr[] = {1,1,2,2,4,5};
        int n = arr.length;
        DuplicateArray obj = new DuplicateArray();
        obj.duplicateArray(arr,n);
    }
}