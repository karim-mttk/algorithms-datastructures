def findRightInterval(self, intervals: List[List[int]]) -> List[int]:
    sorted = []
    n = len(intervals)
    for i in range(n):
        sorted.append([intervals[i], i])
    sorted.sort()

    res = [-1] * n

    def binarySrc(x):
        if sorted[n - 1][0][0] < x:
            return -1
        l, r = 0, n - 1
        while l <= r:
            mid = (l + r) // 2
            if sorted[mid][0][0] >= x:
                r = mid - 1
            else:
                l = mid + 1
        return sorted[l][1]

    for i in range(n):
        res[i] = binarySrc(intervals[i][1])

    return res