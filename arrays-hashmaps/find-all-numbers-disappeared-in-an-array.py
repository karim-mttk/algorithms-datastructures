#solution 1:
def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
    hashset = set()
    L = []
    for i in nums:
        hashset.add(i)
    for i in range(1, (len(nums) + 1)):
        if i not in hashset:
            L.append(i)
    return L

#solution 2: with slightly less code
def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
    hashset = set(nums)
    L = []
    for i in range(1,(len(nums)+1)):
        if i not in hashset:
            L.append(i)
    return L