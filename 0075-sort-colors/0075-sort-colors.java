class Solution {
    public void sortColors(int[] nums) {
        int countOfZeros = 0;
        int countOfOnes = 0;
        int countOfTows = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                countOfZeros++;
            }else if(nums[i]==1){
                countOfOnes++;
            }else{
                countOfTows++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(countOfZeros > 0){
                nums[i] = 0;
                countOfZeros--;
            }else if(countOfOnes> 0 ){
                nums[i] = 1;
                countOfOnes--;
            }else{
                nums[i] = 2;
                countOfTows--;
            }
        }
    }
}