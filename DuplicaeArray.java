import java.util.*;
import java.lang.*;
import java.io.*;
class DuplicateArray{
    public void duplicateArray(int arr[], int n){
        int i=0;
        int j=i+1;
        for(i=0; i<n-1; i++){
            if(arr[i] != arr[j]){
                break;
            }
            else System.out.println(arr[i]);
            j++;
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,2,3};
        int n = arr.length;
        DuplicateArray obj = new DuplicateArray();
        obj.duplicateArray(arr,n);
    }
}