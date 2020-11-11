import java.util.*;
import java.lang.*;
import java.io.*;


class DiStringMatch{
    public int [] diStringMatch(String S){
        int N = S.length();
        int count =N+1;
        int arr[] =new int [count];
        int max =0;
        int min =0;
        for(int i=0; i<count; i++){
            arr[i] = S.charAt(i)=='I'? max++: min--;
        }
        return arr;
    }

    public static void main(String [] args){
        String S = "IID";
        int N = S.length();
        DiStringMatch obj = new DiStringMatch();
        obj.diStringMatch(S);
    }
}
