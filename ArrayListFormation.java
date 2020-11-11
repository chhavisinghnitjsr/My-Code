import java.util.*;
import java.io.*;
class ArrayListFormation{
    int capacity = 10;
    int size;
    double loadfector = 0.75;
    //default constructor ArrayListFormation
    public ArrayListFormation(){
        arr = new int [capacity];
    }

    //parametric constructure;
    public ArrayListFormation(int intiialCapacity){
        if(intialCapacity > 0){
            arr = new int[intialCapacity];
            capacity = intialCapacity;
        }
        else{
            arr = new int[capacity];
        }

    }
    public void static add(int data){
        boolean flag = ensureCapacity();
        if(flag){
            arr[size] = data;
        }
        else{
            growCapacity();
            arr[size] = data;
        }
        size++;

    }
    private void growCapacity(int data){
        int tempArr = arr;
        System.out.println("old capacity"+data);
        capacity = capacity + capacity;
        System.out.println("The new capacity"+capacity);
        tempArr = new int[capacity];
        for(int i=0; i<size; i++){
           arr[i] = tempArr[i];
        }
    }

    public void InsureCapacity(int data){
        if(capacity * loadFector >= size){
             return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        ArrayList arrList = new ArrayList(5);
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrlist.add(5);
    }

}