import java.util.Arrays;
class ArrayPrintTest {
    public int[] getArray() {
        int arr[] = new int[5];
        arr[0] = 11;
        arr[1] = 21;
        arr[2] = 31;
        arr[3] = 41;
        arr[4] = 51;

        return arr;
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        
        System.out.println(arr);

        // arr 
        // obj.getArray()

        for(int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        System.out.println("------------------------------------------------");
        ArrayPrintTest obj = new ArrayPrintTest();
        System.out.println(obj.getArray());
        int temp [] = obj.getArray();

        for(int i = 0; i < temp.length; i++) {
           // System.out.println("arr[" + i + "] = " + temp[i]);
           System.out.print("[" + temp[i] + ", " + "]");
        }
        


        //System.out.println(Arrays.toString(temp));
    }
}