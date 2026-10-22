class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int rem = 0;
        int rev = 0;
        int no = x;
        while(no>0){
            rem = no % 10;
            rev = rev * 10 + rem;
            no = no / 10;
        }

        if(rev == x){
            return true;
        }

        return false;
    }
}