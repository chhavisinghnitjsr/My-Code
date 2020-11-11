import java.util.*;
import java.io.*;
import java.lang.*;

class DefineIpAddStrBuilder{
    public String ipADD(String str1, int len){
       StringBuilder str = new StringBuilder();
        for(int i=0; i<len; i++){
            if(str.charAt(i) == '.'){
                str.append("[.]");
            }
            else{
                str.append(str.charAt(i));
            }
        }
        //return str1.toString();
        return str1;
    }
    public static void main(String[] args){
        String str1 = "1.1.1.1";
        int len = str1.length(); 
        DefineIpAddStrBuilder obj = new DefineIpAddStrBuilder();
        System.out.println(obj.ipAdd(str1,len));   
    }
}