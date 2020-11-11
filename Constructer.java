import java.util.*;
import java.io.*;
class constructor{
    //default constructer;
    //globle variable;
    //constructer which have name as same as class name; 
    public static void constructer(){
        int i = 10;
    }
    //parametric constructer;
    public static constructer(int i){
        //this is a object referance variable;
        this.i = i;
    }
    public static void display(int i){
        for(int i =0; i<n; i++){
            System.out.println(i);
        }

    }
    public static void main(String [] args){
        Constructor obj1 = new Consructor();
        Constructor obj2 = new Consructor(3);


        // when we write 'new' word then jvm's classloader load the class;
        //they take static function at first and then they take the nonstatic function; 
        //here obj is work as objreferance veriable;
        // they provide the memory address for the new create which is intially created by the new
    }


}