class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int key = nums[i];

            if(map.containsKey(key)){
                return true;
            }

            map.put(key, i);
        }
        return false;
    }
}