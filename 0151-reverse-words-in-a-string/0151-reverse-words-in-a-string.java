
class Solution {
    public String reverseWords(String s) {

        // Remove extra spaces and split words
        String arr[] = s.trim().split("\\s+");

        // Reverse words
        StringBuilder sb = new StringBuilder();

        for(int i = arr.length - 1; i >= 0; i--) {

            sb.append(arr[i]);

            if(i > 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
