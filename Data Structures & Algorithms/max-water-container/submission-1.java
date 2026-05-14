// Optimal
class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1, maxWater = Integer.MIN_VALUE;

        while(left < right){
            int width = right - left;
            int height = Math.min(heights[left], heights[right]);
            int area = width * height;

            maxWater = Math.max(area, maxWater);

            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
}
