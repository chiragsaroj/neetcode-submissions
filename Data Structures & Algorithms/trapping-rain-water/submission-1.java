// Optimal

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int totalWater = 0;
        int l = 0, r = n-1;
        int lmax = 0, rmax = 0;

        while(l < r){
            lmax = Math.max(lmax, height[l]);
            rmax = Math.max(rmax, height[r]);

            if(lmax < rmax){
                totalWater += lmax - height[l];
                l++;
            }else{
                totalWater += rmax - height[r];
                r--;
            }
        }
        return totalWater;
    }
}
