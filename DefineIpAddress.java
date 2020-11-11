import java.util.*;
import java.lang.*;
import java.io.*;
class DefineIpAddress{
    public String ipADD(String str1, int len){
        String newStr = "";
       char [] ch = new char[str1.length()+6];
        int j =0;
        for(int i=0; i<len; i++){
            if(str1.charAt(i) == '.'){
                ch[j++] = '[';
                ch[j++] = '.';
                ch[j++] = ']';
                j++;
            }
            else{
                ch[j] = str1.charAt(i);
                j++;
            }
            System.out.println(ch);
            //how to converted charArray into String;
            newStr = new String[ch];
        }
        return newStr;
    }
    public static void main(String [] args){
        String str1 = "1.1.1.1";
        int len = str.length(); 
        DefineIpAddress obj = new DefineIpAddress();
        obj. ipADD(str1,len);   
    }
}