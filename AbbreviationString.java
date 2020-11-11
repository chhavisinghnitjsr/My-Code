import java.util.*;
import java.io.*;
import java.lang.*;

class AbbreviationString{
    //we have to find out only the degit how we have find out;
    public int Abbr(String str){
        String res=0;
        int i =0;
        while(i < abbr.length() && charecter.isDigit(abbr.charAt(i))){
            res = res*10+Charecter.getNumericValue(abbr.charAt(i));
            i++;
        } 
        return str;
    }

    public static void main(String [] args){
        String abbr = "abc123def";
        AbbreviationString obj = new AbbreviationString();
            obj.Abbr();

    }
}