class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        int n = cleaned.length();
        int low = 0, high = n - 1;

        while(low < high){
            if(cleaned.charAt(low) != cleaned.charAt(high)){
                return false;
            }
            low++;
            high--;
        }

        return true;
    }
}
