import java.util.*;
import java.io.*;
class BasicPrimeNo{

    public static  void BTWPrime(int n ){
        int count = 0;
        int primeno = 0;
        int flag = 1;
        for(int i =0; i<=100; i++){
            if(i == 0 || i == 1){
                continue;
            }
            if(i == 2){
                System.out.println("PrimeNo"+i);
                continue;
            }
            for(int j = 3; j <= i/2; j++){
                if(i%j == 0){
                    flag = 0;
                    break;
                } 
            }
            if(flag == 1){
                System.out.println(i);
                //primeno++;
            }   
        }
    }
    public static void main(String[] args){
        int  n = 100;
       
        //int arr[] = {3,1,6,7,8}
        //int n = arr.length;
        BTWPrime(100);
    }
}