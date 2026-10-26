class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int val : nums){
            set.add(val);
        }
        
        int maxLength = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int current = num;
                int count = 1;

                while(set.contains(current + count)){
                    count++;
                }

                maxLength = Math.max(maxLength,count);
            }
        }
        return maxLength;
    }
}