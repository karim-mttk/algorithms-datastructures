class Solution:
    def maxDepth(self, s: str) -> int:
        n = len(s)
        count = 0
        arr = []
        for i in range(n):
            if s[i] == "(":
                arr.append(s[i])
            elif s[i] == ")":
                arr.pop()
            count = max(count, len(arr))
        return count
