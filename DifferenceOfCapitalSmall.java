import java.util.*;
import java.lang.String;
import java.io.*;
class Differnce{
    public int DifferenceOfCapital(String str){
        int count1 =0;
        int count2 =0;
        int totalcount =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)<=90 && str.charAt(i)>=65){
                count1++;
            } 
            else{
                if(str.charAt(i)<=120 && str.charAt(i)>=97){
                    count2++;
                }
            }   
        } 
        totalcount = count1-count2; 
        return totalcount;  
    }
    public static void main(String[]args){
        String str = "RaMaYan";
        int n = str.length();
        Differnce obj = new Differnce();
        obj.DifferenceOfCapital(str);
    }
}