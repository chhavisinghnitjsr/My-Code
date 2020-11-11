import java.util.*;
import java.io.*;
import java.lang.*;

class BalloonCnt{
    public int stringMaxBalloon( String str){
        int res = Integer.MAX_VALUE;
        String balloon = "balloon";
        
        HashMap< Character, Integer> hmap = new HashMap<>();
    
        for( int i = 0;i <balloon.length(); i++){
            if(ha.containsKey( balloon.charAt(i))){
                char key = balloon.charAt(i);
                int value = hashmap.get(balloon.charAt(i));
                res = Math.min(res,value);
            }
        }
        return res;
    }
    public static void main( String[] args){
        BalloonCnt obj = new BalloonCnt();
        String  text = sc.next();
        System.out.println(obj.BalloonCnt(text));
    }
}