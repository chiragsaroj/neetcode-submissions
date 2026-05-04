// With Sorting 
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> smap = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String key = new String(c);

            if(!smap.containsKey(key)){
                smap.put(key, new ArrayList<>());
            }
            smap.get(key).add(strs[i]);
        }

        return new ArrayList<>(smap.values());
    }
}
