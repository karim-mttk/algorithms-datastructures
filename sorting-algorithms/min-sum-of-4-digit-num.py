# v1 easy to understand and implement. The use of array.
import heapq


class Solution:
    def minimumSum(self, num: int) -> int:
        arr = []

        for i in str(num):
            arr.append(i)

        arr.sort()
        one = arr[0] + arr[2]
        two = arr[1] + arr[3]

        return int(one) + int(two)


# v2 using heap to sort the array


class Solution:
    def minimumSum(self, num: int) -> int:
        arr = []

        for i in str(num):
            arr.append(i)

        one, two = heapq.nsmallest(2, arr)
        three, four = heapq.nlargest(2, arr)

        return int(one + three) + int(two + four)
