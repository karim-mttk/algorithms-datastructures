def findSingle(arr):
    res = arr[0]
    for i in range(1, len(arr)-1):
        res = res ^ arr[i]
    return res

arr = [1, 2, 3, 2, 1, 4]

print(findSingle(arr))