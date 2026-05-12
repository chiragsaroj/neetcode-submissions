class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> nmap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int compliment = target - nums[i];
            if(nmap.containsKey(compliment)){
                int val = nmap.get(compliment);
                return new int[]{Math.min(val, i), Math.max(val, i)};
            }
            nmap.put(nums[i], i);
        }

        return new int[]{};
    }
}
