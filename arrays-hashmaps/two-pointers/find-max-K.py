def findMaxK(self, nums: List[int]) -> int:
    hashmap = set(nums)
    L = []

    for i in hashmap:
        if i and -i in hashmap:
            L.append(i)
    if L == []:
        return -1
    return max(L)