import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
class DupHashMap{
    public static void DupHashMap(int arr[] ,int n){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count = 0;
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){//here i wright only one arr[i]; 
                //bcz here i only demand the key ;
                count = map.get(arr[i]);
                map.put(arr[i],count+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        //For checking the duplicate entry of the loop we move a for each loop, entry of the map loop
        //now I hear use the foreach loop because we get from here the duplicate value;
        //due to duplicate value the index is formed;
        //and if duplicate value lies then the indx value is increase by 1 
        //So for chacking the whose keys value is more then 1 or not; 
        //we take a for loop;
        // the loop which is runnning on the map;
        for(Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){//getValue i.e, if count>1;
                System.out.println("There are  repeated element is found:  "+entry.getKey());//that means the value
            }
            else{
                System.out.println("There are not repeted element is found:  "+"-1");
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {3,2,1,7,6,2,3};
        int n = arr.length;
        DupHashMap(arr,n);
    }
}