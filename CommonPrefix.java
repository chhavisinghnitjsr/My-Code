import java.util.*;
import java.lang.*;
import java.io.*;


class CommonPrefix{
    public static String longestCommonPrefix(String [] strs){
        int n = strs.length;
        String prefix = strs[0]; 
        for (int i=0; i<n; i++){             
            prefix = commonPrefixUtil(prefix, strs[i]); 
        } 
        return (prefix); 
    } 
           
    static String commonPrefixUtil(String str1, String str2){ 
        String result = ""; 
        int n1 = str1.length(), n2 = str2.length(); 
        int min = Math.min(str1.length(),str2.length());
        for( int i=0; i<min; i++){ 
                if(str1.charAt(i) != str2.charAt(i)){ 
                    break; 
                }
                result += str1.charAt(i);
            
        }
        return (result); 
    } 

    public static void main(String[] args){     
        String strs [] = {"abc","abc","abcfghy"}; 
        int n = strs.length; 
        String ans = longestCommonPrefix(strs); 
        if (ans.length() > 0){ 
            System.out.printf("The longest common prefix is - %s",ans); 
        } 
        else{ 
            System.out.printf("There is no common prefix"); 
        } 
    } 
} 