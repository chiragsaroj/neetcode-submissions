class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> nmap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(nmap.containsKey(nums[i])){
                return true;
            }

            nmap.put(nums[i], i);
        }

        return false;
    }
}