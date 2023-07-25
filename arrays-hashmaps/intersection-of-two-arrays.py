#solution 1, Time: O(n^2)
def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
    L = []

    for i in nums1:
        if i in nums2:
            L.append(i)
            nums2.remove(i)
    return L

#solution 2, Time: O(n)
def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
    c = Counter(nums1)
    L = []
    for i in nums2:
        if c[i] > 0:
            L.append(i)
            c[i] -= 1
    return L
