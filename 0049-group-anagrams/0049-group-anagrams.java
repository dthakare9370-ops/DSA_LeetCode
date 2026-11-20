class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char arr[] = str.toCharArray();
            Arrays.sort(arr);
            String value = new String(arr);

            if(!map.containsKey(value)){
                map.put(value, new ArrayList<>());
            }

            map.get(value).add(str);
        }

        return new ArrayList<>(map.values());
    }
}