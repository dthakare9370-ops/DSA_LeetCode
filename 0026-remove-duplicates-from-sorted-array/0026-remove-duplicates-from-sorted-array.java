class Solution {
    public int removeDuplicates(int[] arr) {
        int w = 0;
        for(int r=0;r<arr.length-1;r++){
            if(arr[r] != arr[r+1]){
                w++;
                arr[w] = arr[r+1];
            }
        }
        return w+1;
    }
}