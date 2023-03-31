import timeit
import random

# algorithm1: simple code


def maxProductDifference(nums) -> int:
    nums.sort()
    n = len(nums)
    res = (nums[n-1]*nums[n-2]) - (nums[0]*nums[1])
    return res

# algorithm2: illuminati code


def fastMax(nums) -> int:
    max1 = max2 = float('-inf')
    min1 = min2 = float('inf')

    for num in nums:
        if num > max1:
            max2 = max1
            max1 = num
        elif num > max2:
            max2 = num

        if num < min1:
            min2 = min1
            min1 = num
        elif num < min2:
            min2 = num

    return (max1 * max2) - (min1 * min2)


n = [random.randint(0, 100) for _ in range(10000)]

# run algorithm 1 and time it
start_time = timeit.default_timer()
maxProductDifference(n)
maxProductDifference_time = timeit.default_timer() - start_time

# run algorithm 2 and time it
start_time = timeit.default_timer()
fastMax(n)
algorithm2_time = timeit.default_timer() - start_time

# print the results
print("Algorithm 1 time: ", maxProductDifference_time)
print("Algorithm 2 time: ", algorithm2_time)

# determine which algorithm was faster
if maxProductDifference_time < algorithm2_time:
    print("Algorithm 1 is faster")
else:
    print("Algorithm 2 is faster")
