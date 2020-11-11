class ArrayList {
    int capacity = 10;
    int size = 0;
    double loadFactor = 0.75;
    int arr[];

    public ArrayList(){
        arr = new int[capacity];
    }

    public ArrayList(int initialCapacity) {
        if(initialCapacity > 0){
            arr = new int[initialCapacity];
            capacity = initialCapacity;
        } 
        else {
            arr = new int[capacity];
        }
    }

    public void add(int data) {
        System.out.println("calling add function :: " + data);
        boolean flag = ensureCapacity();
        if(flag) {
            arr[size] = data;
        }
        else {
            growCapacity();
            arr[size] = data;
        }
        size++;
    }

    private void growCapacity() {
        int tempArr [] = arr;
        private void growCapacity() {
            int tempArr [] = arr;
            System.out.println("Growing capacity");
    
            System.out.println("old capacity = " + capacity);
            arr = new int[capacity + capacity];
            capacity = capacity + capacity;
            System.out.println("old capacity = " + capacity);
            // copy old data in new array
            for(int i = 0; i < size; i++) {
                arr[i] = tempArr[i];
            }
        }

        private boolean ensureCapacity() {
            System.out.println("ensuring capacity");
            // capacity , size
            if (capacity * loadFactor <= size) {
                return false;
            }
            return true;
        }
    }
    
    public class ArrayListDemo {
        public static void main(String args[]) {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(4);
            arrayList.add(5);
            arrayList.add(6);
        }
    }