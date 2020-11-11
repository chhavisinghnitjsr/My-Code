import java.util.*;
import java.lang.*;
import java.io.*;
class ConcatTwoString{
    public void capital(String str){
        int n = str.length();
        //int i=0;
       // char [] str1 = new char[n];
       // char [] str2 = new char[n];
        String str1 = "";
        String str2 = "";
        for(int i=0; i<n; i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                str1 = str1 + str.charAt(i);
            }
            else{
                if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                    str2 = str2 + str.charAt(i);
                } 
                //continue; 
            } 
        }
        String str3 = str1.concat(str2);
        System.out.println(str3);
    } 
        public static void main(String[] args){
        Delete obj = new Delete();
        Scanner sc = new Scanner(System.in);
        //String str = null;
        String str = sc.nextLine();
        obj.capital(str);      
    }
}