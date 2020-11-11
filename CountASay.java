import java.util.*;
import java.lang.*;
import java.io.*;


class CountASay{
    public  String countAndSay(int n){
       String res = "1";  
       String str = "1";
       
        if(n <=0){
            return "";
        }
        if(n==1){
            res =  str;
        }
        if(n==2){
            res = "11";
            res =  str;
        }
            for( int  i = n; i> 0; --i){ 
                str = res;//1--//11..//21...//
                res = "";
                //int i =0;
                int count =1;
                char temp = str.charAt(0);
                if(n>2){
                    for(int j=1; j<str.length(); j++){
                        //count =1;
                        if(str.charAt(i) == temp){
                            count++;//2
                        }
                        else{
                            res = res + count + temp;//12
                            temp = str.charAt(i);
                            count =1;
                        }
                    }
                }
                if(n==1){
                    res =  str;
                }
                if(n==2){
                    res = "11";
                    res =  str;
                }
                res = res+count+temp;//11..//21
            str = res;
          }
        //System.out.println("chhavi");
        return res;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CountASay obj = new CountASay();
        System.out.println(obj.countAndSay(n));
    } 
}