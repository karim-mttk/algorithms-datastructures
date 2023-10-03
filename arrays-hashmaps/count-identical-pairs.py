def numIdenticalPairs(self, nums: List[int]) -> int:
    di = {}
    res = 0

    for i in nums:
        if i not in di:
            di[i] = 1
        else:
            di[i] += 1
            res += di[i] - 1
    return res