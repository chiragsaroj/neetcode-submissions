class Solution {
    // Function to calculate total hours at given speed
    private int calcTotalHours(int[] piles, int speed) {
        int totalH = 0;
        for (int bananas : piles) {
            totalH += (int)Math.ceil((double)bananas / speed);
        }
        return totalH;
    }

    public int minEatingSpeed(int[] a, int h) {
        int maxPile = Arrays.stream(a).max().getAsInt();

        int low = 1, high = maxPile, ans = maxPile;

        while(low <= high){
            int mid = low + (high - low)/2;

            int totalHours = calcTotalHours(a, mid);
            if(totalHours <= h){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return ans;
    }
}
