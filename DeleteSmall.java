import java.util.*;
import java.io.*;
import java.lang.*;
class DeleteSmall{
    public String capital(String str){
        int n = str.length();
        String str1 = "";
        for(int i=0;i<n;i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                str1 = str1 + str.charAt(i);
            }
        }
        return str1;
    }
    public static void main(String [] args){
        String str="ramYANna";
       DeleteSmall obj = new DeleteSmall();
       System.out.println(obj.capital(str));  
    }
}