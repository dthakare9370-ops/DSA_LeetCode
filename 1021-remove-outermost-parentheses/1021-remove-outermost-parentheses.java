class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuffer sb = new StringBuffer("");
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '('){
                if(!st.isEmpty()){
                    sb.append(ch);
                }
                st.push(ch);
            }else{
                st.pop();

                if(!st.isEmpty()){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}