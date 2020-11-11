import java.util.*;
import java.io.*;
import java.lang.*;


class ReplaceAString{
    //the Questions is about how to replace the (.) cherecter into the [.] this string
    //for this we made the two String
    public String replace(String str1, int len){
       //and also i use charAt(i); 
        // String str2 = new String[str1.length()+6];
        String str2 = "";
        for(int i=0; i<len; i++){
            char ch = str1.charAt(i);
            if(ch == '.'){
               /* str2.charAt(j) = '[';//char how tob replace a integer value;
                str2.charAt(j++)= '.';
                str2.charAt(j+2) = ']';
                j++;
                */
                str2 = str2 +"[.]";
            }
            else{
                /*str2.charAt[j] = str1[i]; 
                j++;
                */
                str2 = str2 + ch;
            }
        }

       // String str2 = new String[Arr2];
        //String str2 = String.valueOf[Arr2];
            return str2;
    }
    public static void main(String [] args){
        String str1 = "1.1.1.1";
        int len = str1.length();
        
        ReplaceAString obj = new ReplaceAString();
        System.out.println(obj.replace(str1,len));

    }
}

    