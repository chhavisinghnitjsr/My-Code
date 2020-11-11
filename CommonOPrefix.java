import java.util.*;
import java.lang.*;
import java.io.*;


class CommonOPrefix{
    String commonPrefixUtil(String str1, String str2){ 
        String result =""; 
        int count =0;
        int n1 = str1.length(), n2 = str2.length(); 
        for(int i=0; i<n1; i++){ 
            System.out.println("chhavi  "+i+"  "+str1.charAt(i));//0->a,1->b,2->d
            for( int j=0; j<=n2-1; j++){ 
                if (str1.charAt(i) != str2.charAt(j)){ 
                    break; 
                } 
                result += str1.charAt(i);
            } 
            count++;
            /*
            if(count == n1-1){
                return (result);
            }
            */
            //System.out.println("***"+i);
        }
        return result; 
    }
    public  String longestCommonPrefix(String [] strs){
        int n = strs.length;
        String prefix = strs[0]; 
        System.out.println(strs[0]);
        for (int i=1; i<=n-1; i++){             
            prefix = commonPrefixUtil(prefix, strs[i]); 
        } 
        return (prefix); 
    } 
           
    public static void main(String[] args){     
        String strs [] = {"abdrfgh","b","abc"}; 
        int n = strs.length; 
        CommonOPrefix obj = new CommonOPrefix();
        String ans = obj.longestCommonPrefix(strs);      
    } 
} 