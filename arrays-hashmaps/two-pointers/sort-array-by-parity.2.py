def sortArrayByParityII(self, nums: List[int]) -> List[int]:
    i = 0
    j = 1
    while i < len(nums) and j < len(nums):
        if nums[i] % 2 != 0 and nums[j] % 2 == 0:
            nums[i], nums[j] = nums[j], nums[i]
            i += 2
            j += 2
        elif nums[i] % 2 != 0:
            j += 2
        elif nums[j] % 2 == 0:
            i += 2
        else:
            i += 2
            j += 2
    return nums

#fastest method:
    def sortArrayByParityII(self, nums: List[int]) -> List[int]:
        j = 1
        for i in range(0, len(nums), 2):
            if nums[i] % 2:
                while nums[j] % 2:
                    j += 2
                nums[i], nums[j] = nums[j], nums[i]
        return nums