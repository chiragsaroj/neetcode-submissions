class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++){
            int[] m = matrix[i];
            int low = 0, high = m.length-1;

            if(m[low] <= target && target <= m[high]){
                while(low <= high){
                    int mid = low + (high - low)/2;
                    if(m[mid] == target){
                        return true;
                    }else if(m[mid] >= target){
                        high = mid - 1;
                    }else{
                        low = mid + 1;
                    }
                }
            }
        }

        return false;
    }
}
