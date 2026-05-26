class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length; 
        int startRow = 0, endRow = m-1;

        while(startRow <= endRow){
            int midRow = startRow + (endRow - startRow)/2;

            if(matrix[midRow][0] <= target && target <= matrix[midRow][n-1]){
                int low = 0, high = n-1;

                while(low <= high){
                    int mid = low + (high - low)/2;
                    if(matrix[midRow][mid] == target){
                        return true;
                    }else if(target > matrix[midRow][mid]){
                        low = mid + 1;
                    }else{
                        high = mid - 1;
                    }
                }

                break;
            }else if(target > matrix[midRow][n-1]){
                startRow = midRow + 1;
            }else{
                endRow = midRow - 1;
            }
        }

        return false;
    }
}
