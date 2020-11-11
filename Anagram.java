import java.util.*;
import java.lang.*;
import java.io.*;


class Anagram{
    public boolean StringAnagram(String str1, String str2)){
            if(str1.length() == str2.length()){
                for(int i=0; i<str1.length(); i++){
                    for(int j =0;j<str2.length();j++){
                        if(str.charAt(i) == str.charAt(j)){
                            count++;
                        }
                    }
                if(count == str1.length()){
                    System.out.println(Anagram);
                    return true;
                }
            }
        }
        else{
            return false;
        }
        return false;
    }

     public static void main(String [] args){
        String str = "Abcd";
        ReverseAString obj = new ReverseAString();
        System.out.println(obj.ReverseString(str));
    }
}