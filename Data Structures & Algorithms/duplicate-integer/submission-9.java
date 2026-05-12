class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            int key = nums[i];

            if(set.contains(key)){
                return true;
            }

            set.add(key);
        }
        return false;
    }
}