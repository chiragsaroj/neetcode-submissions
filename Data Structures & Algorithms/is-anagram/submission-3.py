class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        ch = [0]*26

        for i in range(len(s)):
            ch[ord(s[i]) - ord('a')] += 1
            ch[ord(t[i]) - ord('a')] -= 1

        for c in ch:
            if c != 0:
                return False
        
        return True