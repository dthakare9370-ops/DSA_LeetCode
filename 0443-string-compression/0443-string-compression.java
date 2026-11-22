
class Solution {
    public int compress(char[] chars) {

        int index = 0;
        int i = 0;

        while(i < chars.length) {

            char current = chars[i];
            int count = 0;

            // Count same characters
            while(i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            // Store character
            chars[index] = current;
            index++;

            // Store count if greater than 1
            if(count > 1) {

                String str = String.valueOf(count);

                for(char ch : str.toCharArray()) {
                    chars[index] = ch;
                    index++;
                }
            }
        }

        return index;
    }
}
