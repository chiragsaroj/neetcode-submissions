class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> nmap = new HashMap<>();

        for(int i=0; i<n; i++){
            int compliment = target - nums[i];

            if(nmap.containsKey(compliment)){
                int j = nmap.get(compliment);
                return i <= j ? new int[]{i, j} : new int[]{j, i};
            }

            nmap.put(nums[i], i);
        }

        return new int[]{-1,-1};
    }
}
