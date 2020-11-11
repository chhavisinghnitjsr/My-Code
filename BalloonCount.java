import java.util.*;
import java.lang.*;
import java.io.*;

class BalloonCount{ 
    public int maxNumberOfBalloons(String text){
        char[] ch = text.toCharArray();
        int[] res = new int[26]; //count all letters
        for (char c : ch){//we use the foreach loop bcz we take a char type input;
            res[c - 'a']++;//when i use the for each loop then we have not  need of extra  i,j; 
        }
        int min = res[12];//for b
        min = Math.min(min, res[0]);//for a
        min = Math.min(min, res[11] / 2);// for l /2 
        min = Math.min(min, res[14] / 2);//similarly for o/2
        min = Math.min(min, res[13]);//for n
        return min;        
    }

    public static void main(String [] args){
        String text = "malloonmalloon";
        BalloonCount obj = new BalloonCount();
        System.out.println(obj.maxNumberOfBalloons(text));    
    }
}