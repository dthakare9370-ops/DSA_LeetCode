class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int data : nums){
            if(set.contains(data)){
                return data;
            }
            set.add(data);
        }
        return -1;
    }
}