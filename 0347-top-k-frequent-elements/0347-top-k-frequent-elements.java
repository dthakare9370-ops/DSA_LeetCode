class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        List<Integer> bucket[] = new List[nums.length+1];

        for(int i=0;i<bucket.length;i++){
            bucket[i] = new ArrayList<>();
        }

        for(int i : map.keySet()){
            bucket[map.get(i)].add(i);
        }

        List<Integer> temp = new ArrayList<>();
        for(int i=bucket.length-1;i>=0;i--){
            List<Integer> list = bucket[i];
            for(int j : list){
                temp.add(j);
            }
        }

        int res[] = new int[k];
        while(k-- > 0){
            res[k] = temp.get(k);
        }

        return res;
    }
}