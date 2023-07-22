#version 1:
def majorityElement(self, nums: List[int]) -> int:
    di = {}
    for n in nums:
        if n not in di:
            di[n] = 0
        di[n] += 1

    key = max(di, key=di.get)
    return key

#version 2:
#very slow with bad time complexity
def majorityElement(self, nums: List[int]) -> int:
    max_value = None
    max_count = 0

    for n in nums:
        count = nums.count(n)
        if count > max_count:
            max_value = n
            max_count = count

    return max_value