import java.util.*;
import java.lang.*;
import java.io.*;

class DuckString{
   public boolean DuckNo(String str){
       boolean flag = false;
       int i =0;
       while(i<str.length()){
           if(str.charAt(0) == '0'){
               i++;
                if(str.charAt(i)=='0'){
                    flag = true;
                    break;
                }
            }
            else{
                i++;
                if(str.charAt(i)==0){
                    flag = true;
                    break;
                }
            }          
       }
       return flag;
    }
    public static void main(String [] args){
        String str = "027301";
        DuckString obj = new DuckString();
        System.out.println(obj.DuckNo(str));
        
    } 
}