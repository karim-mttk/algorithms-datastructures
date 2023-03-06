#v1. runtime of O(n)
def shuffle(self, nums: List[int], n: int) -> List[int]:
        arr = []
        i = 0
        j = int(len(nums) / 2)
        while j < len(nums):
            arr.append(nums[i])
            arr.append(nums[j])
            i += 1
            j += 1
        return arr   

#v2. almost same runtime, but with less code
def shuffle(self, nums: List[int], n: int) -> List[int]:
    return [nums[i//2] if i%2 == 0 else nums[n + i//2] for i in range(2*n)]

