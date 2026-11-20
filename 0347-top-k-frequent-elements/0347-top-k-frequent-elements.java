class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        Queue<Integer> minHeap = new PriorityQueue<>(
            (a,b)-> map.get(a) - map.get(b)
        );

        for(int key : map.keySet()){
            minHeap.add(key);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        int res[] = new int[k];

        while(k-- > 0){
            res[k] = minHeap.poll();
        }

        return res;
    }
}