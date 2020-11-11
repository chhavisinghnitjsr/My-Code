import java.util.*;
import java.lang.*;
import java.io.*;

class CountAndSayString{
    public String countAndSay(int n){
        String str ="";
        int count =1;
        char say ='\0';
        String res ="";
        StringBuilder sb = new StringBuilder();
        if(n==0){
            return str;
        }
        if(n==1){
            String strN = "n";
            res=strN;
            return res;
        }
        if(n==2){ 
            int i=0;
            String sOne = "1";
            res =res+sb.append(res.charAt(i));
            return res;
        }
        for(int i=3; i<str.length(); i++){
            for(int j=0;j<res.length();j++){
                if(str.charAt(i) != str.charAt(j)){
                    count = 1;//reset the count;
                    break; 
                }
                else{
                    count++;
                    res = res+sb.append(count);
			        res = res+sb.append(str.charAt(j));
			        
                }
            }
        }
        return res;
    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt(); 
        CountAndSayString obj = new CountAndSayString();
        obj.countAndSay(n);
    } 
}