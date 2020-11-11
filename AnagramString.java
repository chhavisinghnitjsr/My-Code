import java.util.*;
import java.io.*;
import java.lang.*;

   
public class AnagramString { 

    static void isAnagram(String str1, String str2)
    {  
       // At first we remove all space
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean flag = true;  
        if (s1.length() != s2.length()) {  
            flag = false;  
        }
        else { 
            //here we convert the String  int the Array 
            //here i donot understand the why we have need to lowercase and  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            flag = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (flag){  
            System.out.println(s1 + " and " + s2 + " are anagrams");  
        }   
        else{  
            System.out.println(s1 + " and " + s2 + " are not anagrams");  
        }  
    } 

    public static void main(String[] args){  
        String str1 = "cat is rat";
        String str2 = "rat is cat";
        AnagramString obj = new AnagramString();
        obj.isAnagram(str1, str2);
    }  
}