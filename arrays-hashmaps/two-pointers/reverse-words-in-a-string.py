class Solution:
    def reverseWords(self, s: str) -> str:
        s = list(s)  # Convert string to list of characters
        l = 0
        r = 0
        while l < len(s):
            while r < len(s) and s[r] != ' ':
                r += 1
            s[l:r] = reversed(s[l:r])  # Reverse the current word
            l = r + 1
            r = l
        return ''.join(s)  # Convert list of characters back to string
