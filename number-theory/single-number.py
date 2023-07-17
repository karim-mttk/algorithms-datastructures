def singleNumber(self, nums: List[int]) -> int:
    counts = {}
    for num in nums:
        if num in counts:
            counts[num] += 1
        else:
            counts[num] = 1

    for num, c in counts.items():
        if c == 1:
            return num
