class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        l = 0
        r = n - 1
        maxAr = 0
        while l < r:
            area = min(height[l], height[r]) * (r - l)
            maxAr = max(area, maxAr)

            if height[l] <= height[r]:
                l += 1
            else:
                r -= 1
        return maxAr
