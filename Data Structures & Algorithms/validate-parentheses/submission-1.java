class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> brackets = new HashMap<>(Map.of(
            '(',')',
            '{', '}',
            '[', ']' 
        ));

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(brackets.containsKey(c)){
                stack.push(c);
                continue;
            }

            if(!stack.isEmpty() && brackets.get(stack.peek()) == c){
                stack.pop();
            }else{
                return false;
            }
        }

        return stack.isEmpty();
    }
}
