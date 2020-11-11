import java.util.*;
import java.lang.*;
import java.io.*;


class CountAndSayString{
        public String stringCountAndSay(int n){
            if (n <= 0) 
            {
                return "";
            }
            String res = "1";
            for (int i = 1; i < n; i++){
                String str = res;
                res = "";
                int count = 1;
               
                char temp = str.charAt(0);
                for (int j = 1; j < str.length(); j++){
                    if (str.charAt(j) == temp){
                        count++;
                    }
                    else{
                        res = res + count + temp;
                        temp = str.charAt(j);
                        count = 1;
                    }
                }
                res = res + count + temp;
            }
            return res;
        }
    
    public static void main(String [] args){
        CountAndSayString obj = new CountAndSayString();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //obj.stringCountAndSay( n);
        System.out.println(obj.stringCountAndSay( n));
    
    } 
}