import java.util.*;
import java.io.*;
class ArrivalofGeneral{
    public void Swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int generalArrival(int arr[], int n){    
        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count1 =0;
        int count2 =0;
        int totalcount =0;
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("max : "+max);

        for(int i=0; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("min"+min);

        for(int i=0; i<n; i++){
            if(arr[0] != max){
                Swap(arr,i,max);
                count1++;
            }
            if(arr[n-1] != min){
                Swap(arr,i,min);
                count2++;
            }
        }

        totalcount = count1+count2;
        System.out.println("totalCount"+totalcount);
        return totalcount;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i =0;
       
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(i =0;i<n;i++){
            if( arr[i] >0 && arr[i]<100){
                System.out.println(arr[i]);
            }
            else{
                System.out.println("number not fullfill the condition");
            }
        }
    }
    ArrivalofGeneral obj = new ArrivalofGeneral();
    obj.System.out.println(obj.generalArrival(arr,n));

}