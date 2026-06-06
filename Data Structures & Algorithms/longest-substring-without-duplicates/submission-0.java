class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++){
            Map<Character, Integer> map = new HashMap<>();
            
            for(int j = i; j < s.length(); j++){
                if(map.containsKey(s.charAt(j))) break;

                int currLength = j - i + 1;
                maxLength = Math.max(currLength, maxLength);
                map.put(s.charAt(j), j);
            }
        }

        return maxLength;
    }
}
