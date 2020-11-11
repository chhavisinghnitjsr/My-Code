import java.util.HashMap;
import java.io.*;
class Arraylist{
     public static void main(String args[]) {
        int arr[] = {1,3,3,4,4,4,4};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            } 
            else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        System.out.println(map);
        int maxFrequency = Integer.MIN_VALUE;

        for(Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxFrequency) {
                 maxFrequency = entry.getValue();
            }
        }
        System.out.println("operation " + (arr.length - maxFrequency));
    }
}