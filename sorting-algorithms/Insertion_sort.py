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


"""
def sortArray(self, nums: List[int]) -> List[int]:
    for i in range(1, len(nums)):  # Start from the second element (index 1)
        j = i
        while j > 0 and nums[j] < nums[j - 1]:
            nums[j], nums[j - 1] = nums[j - 1], nums[j]
                j -= 1
        return nums
"""


def ins_sort_rec(seq, i):
    if i == 0:
        return
    ins_sort_rec(seq, i - 1)
    j = i
    while j > 0 and seq[j - 1] > seq[j]:
        seq[j - 1], seq[j] = seq[j], seq[j - 1]
        j -= 1


def ins_sort(seq):
    for i in range(1, len(seq)):
        j = i
        while j > 0 and seq[j - 1] > seq[j]:
            seq[j - 1], seq[j] = seq[j], seq[j - 1]
            j -= 1


A = [5, 2, 4, 6, 1, 3]
B = [1, 3, 5, 6, 7, 8, 8, 9, 5, 3, 2, 2, 11, 4, 1, 2, 3]
# insertion_sort(A)
# ins_sort_rec(A, 5)
ins_sort(B)
print(B)

