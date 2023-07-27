def topKFrequent(self, nums: List[int], k: int) -> List[int]:
    di = {}

    for num in nums:
        if num not in di:
            di[num] = 1
        else:
            di[num] += 1

    di = dict(sorted(di.items(), key=lambda x: x[1], reverse=True))

    res = list(di.keys())[:k]

    return res

#NOTES: There are multiple ways to sort the dictionary
