class Solution:
    def isValid(self, s: str) -> bool:
        stack = deque()
        mapping = {
            '}': '{',
            ']': '[',
            ')': '(',
        }

        for char in s:
            if char in mapping:
                top = stack.pop() if stack else None
                if top != mapping[char]:
                    return False
            else:
                stack.append(char)

        return len(stack) == 0

