class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0; int j = n-1;

        Map<Integer, Integer> map = new HashMap<>();

        while(i < j){
            int sum = numbers[i] + numbers[j];

            if(sum == target){
                return new int[]{i+1,j+1};
            }else if(sum > target){
                j--;
            }else{
                i++;
            }
        }

        return new int[]{};
    }
}
