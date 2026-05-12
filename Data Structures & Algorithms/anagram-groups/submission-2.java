class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String key = new String(charArr);

            if(!group.containsKey(key)){
                group.put(key, new ArrayList());
            }

            group.get(key).add(strs[i]);
        }

        return new ArrayList(group.values());
    }
}
