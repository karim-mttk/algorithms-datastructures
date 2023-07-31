def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
    L = []
    for i in nums1:
        n2 = nums2.index(i)
        for j in range(n2, len(nums2)):
            if nums2[j] > i:
                L.append(nums2[j])
                break
        else:
            L.append(-1)
    return L


