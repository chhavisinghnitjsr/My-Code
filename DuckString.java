import java.util.*;
import java.lang.*;
import java.io.*;

class DuckString{
   public boolean DuckNo(String str){
        boolean flag =false;
        int i =0;
        //System.out.println("chhavi");
        while(i < str.length()){
            
            if(str.charAt(0) =='0')
                i++;//1,2,3,4,5,6,7;
            if(str.charAt(i) =='0')
                flag = true;
                i++;
        }
    
        while(i < str.length()){
            if(str.charAt(i) !='0')
                i++;
            if(str.charAt(i) =='0')
                flag = true;
                i++;
        }
        return flag;
    }

    public static void main(String [] args){
        String str = "020731";
        DuckString obj = new DuckString();
        System.out.println(obj.DuckNo(str)); 
    } 
}