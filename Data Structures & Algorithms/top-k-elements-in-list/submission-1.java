class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] res = new int[k];
        // 1. count freq in HashMap
        Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums){
            map.merge(n,1,Integer::sum);
        }

        List<Integer>[] buckets = new List[nums.length+1];
        
        for(int key : map.keySet()){
            int pos = map.get(key);
            if(buckets[pos]==null){
                buckets[pos] = new ArrayList<>();
            }

            buckets[pos].add(key);
        }
        int pos =0;
        for(int i=nums.length;i>0;i--){
            if(buckets[i]!=null){
                for(int num : buckets[i]){
                    res[pos++] = num;
                    if(pos==k) return res;
                }

            }
        }

        // //2. using Mean Heap 
        // PriorityQueue<Integer> pq = new PriorityQueue<>(
        //     (a,b) -> map.get(a) - map.get(b) //comparator
        //     //using comparator the element with the lowest frequency come to the top.
        //     //this is called Mean Heap
        // );

        // for(int key : map.keySet()){
        //     pq.add(key);

        //     if(pq.size()>k){
        //         pq.poll();
        //     }
        // }

        // for(int i=0;i<k;i++){
        //     res[i] = pq.poll();
        // }

        return res;

    }
}