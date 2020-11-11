import java.util.*;
import java.io.*;
import java.lang.*;

class ArrInsertOprn{
    static int [] arr  = new int[7]; 
    int index = 0; 

    public int [] insert(int element){

        if(index == 0||index < arr.length){
            arr[index] = element;
            index++;
            return arr;
        }

        if(index == arr.length){
            int [] newArr = new int [2*arr.length];
            for(int i=0; i<newArr.length; i++){ 
                
                if(i < arr.length){
                    newArr[i] = arr[i];
                }
                if(i == arr.length){
                    newArr[i] = element;
                    break;
                 
                }
            }
                arr = newArr;
                return arr;
        } 
        return arr;
    } 

    public int [] insertAtPos(int index, int element, int pos){
        if(pos < 0){
            return arr;
        }
        if(pos < index){
            int temp = 0;
            int temp1 =0;
            
            for( int i=0; i<= index; i++){
                if(i < pos-1){
                    continue;
                }
                else if(i == (pos-1)){
                    temp = arr[i];
                    System.out.println("The temp is"+temp);
                    arr[i] = element;
                    System.out.println("The pushed element :" + arr[i]);
                }
                else{
                    if( i == pos){
                        temp1 = arr[i];
                        arr[i] = temp;
                        System.out.println("chhavi");
                    }
                    else{
                        arr[i+1] = temp1;
                    }
                }
            } 
        }
    
        if(pos >= index){
            System.out.println("chhavi");
                int newArr[] = new int[arr.length+1];
                if(pos > newArr.length){
                    System.out.println("invalid");
                }
                else{
                    for(int i=0; i<newArr.length; i++){//3 we take element at the pos 2; 
                        if(i < pos-1){
                            newArr[i] = arr[i];
                            //System.out.println("The element less then i"+newArr[i]);
                        }
                        else if(i == pos-1){
                            newArr[i] = element;
                            
                        }
                        else{
                            newArr[i] = arr[i-1];
                            
                        }
                    }
                    
                }
            arr = newArr;
            System.out.println(arr.length);
        }
        return arr;
    }

    public int [] deleteBeg(){
        for(int i=0; i<index; i++){
            arr[i] = arr[i+1];
            System.out.println(arr[i]);
        }
        return arr;
    }

    public int [] deleteEnd(){
        if(index == 0){
            return arr;
        }

        System.out.println("inside the delete at END");
        index--;
        return arr;
    }
    
    public int [] deletePos(int pos){ 
        //Scanner sc = new Scanner(System.in);
        System.out.println(arr.length);
        for(int i=0; i<index; i++){
            if(i < pos){
                arr[i] = arr[i];
            }
            if(i > pos-1){
                arr[i] = arr[i+1];
            }
            System.out.println(arr[i]);
        }

        return arr;
    }

    public int [] SearchElement(int pos){
        int element =0; 
        for(int i=0; i<arr.length; i++){
            if(i == pos-1){
                System.out.println("The element is at pos:"+element);
            }
        }
        return arr;
    }

    public void display(){
        System.out.println("-------------------------------------------");
        System.out.println("array statistics:: ");
        System.out.println("length = " + arr.length);
        System.out.println("size = " + index);

        for(int i=0; i < index; i++){
            System.out.println("arr["+i+"] = " + arr[i]);
        }

        System.out.println("-------------------------------------------");
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //int pos = sc.nextInt();
        int element;
        int ch;
        int pos =0;
        //int index =0;
        ArrInsertOprn obj = new ArrInsertOprn();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
        obj.insert(6);
        obj.insert(7);
        obj.insert(8);

        obj.display();
        obj.deleteEnd();
        obj.display();

        // do{
        //     System.out.println("please enter your choice");
        //     ch = sc.nextInt();
        //     switch (ch){
        //         case 1:
        //             System.out.println("Please enter the element for insertion");
        //             element = sc.nextInt(); 
        //             obj.insert(element);
        //             break;

        //         case 2:
        //             System.out.println("please enter the pos: ");
        //             pos = sc.nextInt();
        //             System.out.println("please enter the element: ");
        //             element = sc.nextInt();
        //             obj.insertAtPos(index,element,pos);
        //             break;
                
        //         case 3:
        //             obj.deleteBeg(arr);
        //             break;

        //         case 4:
        //             System.out.println("give the pos for delete:"+pos);
        //             obj.deletePos(arr,pos);
        //             break;

        //         case 5:
        //         obj.deleteEnd(arr);
        //             break;

        //         case 6:
        //             System.out.println("Now the Array is: ");
        //             obj.SearchElement(arr,pos);
        //             break;

        //         case 7:
        //             System.out.println("Now the Array is: ");
        //             obj.display();
        //             break;

        //         case 8:
        //             System.exit(0);

        //         default:
        //             System.out.println("not valid");
        //     }
        // }while(ch<9);
        //for displaying the element of an array element is
        //for(int i=0; i<size; i++){//we donot here write the arr.length;
            //bcz if we take input the size then it is infite therefore it is neccessay to first we take the
            //  size; then we put the arry element; 
            //System.out.println("**"+arr[i]);
        //}
        //ArrInsertOprn obj = new ArrInsertOprn();
        //obj.beg(arr,size,element); 
        //obj.insertAtEnd(arr,size,element);
        //obj.insertAtPos(arr,size,pos,element);
        //int retArr[] = new int[arr.length+1]; 
        //retArr = obj.beg(arr,element);
        //now i want to print the retArr element;
        //for(int i=0; i<(size+1); i++){
        //    System.out.println(retArr[i]);
        //}
    }
}