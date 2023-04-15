# v1 time complexity: O(n)
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        i = 0
        ans = 0
        mp = {}
        n = len(s)

        for j in range(n):
            if s[j] in mp:
                i = max(mp[s[j]], i)
            ans = max(ans, j-i+1)
            mp[s[j]] = j+1

        return ans
