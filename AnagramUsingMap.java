import java.util.*;
import java.io.*;
import java.lang.*;


class AnagramUsingMap{
    public boolean Anagram(String str1,String str2){
        boolean flag = false;
        HashMap <Character> map = new HashMap<Character>();
        if(str1.length() == str2.length()){
            return false;
        }

        for(int i=0; i<str1.length(); i++){//1
            for(int j=i+1; j<str2.length(); j++){//2,
                if(map.contains(i)){//
                    return true;
                }
                else{
                    return false;
                }
            }
        }
    }
   
    public static void main(String [] args){
        String str1 = "Abcd";
        ReverseAString obj = new ReverseAString();
        System.out.println(obj.ReverseString(str));
    }
}