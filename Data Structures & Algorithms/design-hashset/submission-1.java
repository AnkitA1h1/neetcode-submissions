// class MyHashSet {

//     private final int DELETED = Integer.MIN_VALUE;
//     private Integer[] arr;
//     private int size;

//     public Integer[] getArr() {
//         return arr;
//     }

//     private int te;

//     public MyHashSet(){
//         this.size = 11;
//         this.te =0;
//         this.arr = new Integer[size];
//     }

//     public int hasHFun(int key){
//         return Math.floorMod(key, size);
//     }

//     public void add(int key) {
//         if((double) (te + 1) / size >= 0.7){
//             te=0;
//             growArraySize();

//         }
//         int pos = hasHFun(key);
//         if(arr[pos]!= null && arr[pos]== key) return;
//         int i=1;
//         while(arr[pos]!= null){
//             pos = (key+i) % size;
//             i++;
//         }
//         te++;
//         arr[pos] = key;
//     }

//     public void remove(int key) {
//         int pos = hasHFun(key);
//         if(arr[pos] == null) return;
//         if(arr[pos]!=null && arr[pos] == key){
//             arr[pos] = DELETED;
//             te--;
//             return;
//         }

//         int i =1;
//         while(arr[pos]!=null && i<size){
//             pos = (key +i) % size;
//             if(arr[pos]!=null && arr[pos]== key){
//                 arr[pos] = DELETED;
//                 te--;
//                 return;
//             }
//             i++;
//         }

//     }

//     public boolean contains(int key) {
//         int pos = hasHFun(key);
//         if(arr[pos]!=null && arr[pos] == key) return true;
//         int i=1;
//         while (arr[pos]!= null && i<size){
//             pos = (key+i) % size;
//             if(arr[pos]!=null && arr[pos] == key) return true;
//             i++;
//         }
//         return false;
//     }

//     private void growArraySize() {
//         Integer[] temp = new Integer[size];
//         System.arraycopy(arr, 0, temp, 0, size);
//         size = (size*2)+1;
//         arr = new Integer[size];
//         for(Integer t : temp){
//             if (t!= null && t != DELETED) add(t);
//         }
//     }

// }

class MyHashSet {

    private List<Integer>[] buckets;
    private int size;
    //private te;

    public MyHashSet() {
        this.size = 10001;
        buckets = (List<Integer>[]) new List[size];

        for (int i = 0; i < size; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    public int hashFun(int key){
        return key%size;
    }

    public void add(int key) {
        int pos = hashFun(key);
        if(!buckets[pos].contains(key))
            buckets[pos].add(key);
    }
    
    public void remove(int key) {
        int pos = hashFun(key);
        if(buckets[pos].contains(key))
            buckets[pos].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int pos = hashFun(key);
        if(buckets[pos].contains(key)) return true;

        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */