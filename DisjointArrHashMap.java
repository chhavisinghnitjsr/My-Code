import java.util.*;
import java.io.*;
class DisjointArrHashMap
{
    public static boolean StringHash(int arr1[], int arr2[], int n1, int n2)
    {
        HashSet <Integer> set = new HashSet <> ();
        for(int i=0; i<n1; i++){
            if(!set.contains(arr1[i])){
                set.add(arr1[i]);
            }
        }
        for(int i=0; i<n2; i++){
            if(!set.contains(arr2[i])){
                set.add(arr2[i]);
            }
        }
        return true;
    }
    public static void main(String [] args)
    {
        int arr1 [] = {2,4,3,6,1,8};
        int n1 = arr1.length;
        int arr2 [] = {2,5,1,7,8};
        int n2 = arr2.length;
        if(StringHash(arr1, arr2, n1, n2)){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        
    }
}