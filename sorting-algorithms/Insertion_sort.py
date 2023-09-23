# v1

# insertion sort runtime = O(n^2)
def insertion_sort(A):
    for j in range(1, len(A)):
        key = A[j]
        i = j - 1
        while i >= 0 and A[i] > key:
            A[i + 1] = A[i]
            i -= 1
        A[i + 1] = key

#v2
def sortArray(self, nums: List[int]) -> List[int]:
    for i in range(1, len(nums)):  # Start from the second element (index 1)
        j = i
        while j > 0 and nums[j] < nums[j - 1]:
            nums[j], nums[j - 1] = nums[j - 1], nums[j]
                j -= 1
        return nums

A = [5, 2, 4, 6, 1, 3]
insertion_sort(A)
print(A)
