class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }

        Set<Integer> st = new HashSet();

        for(int i=0; i<n; i++){
            st.add(nums[i]);
        }

        int longest = 1;
        for(int s: st){
            if(!st.contains(s-1)){
                int count = 1;
                int curr = s;

                while(st.contains(curr+1)){
                    curr++;
                    count++;
                
                    longest = Math.max(longest, count);
                }
            }
        }

        return longest;
    }
}
