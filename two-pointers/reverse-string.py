class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        n = len(s) - 1
        l = 0
        r = n
        while l < r:
            s[l], s[r] = s[r], s[l]
            l += 1
            r -= 1
