#v1 recursive function
def binary_recur(arr, start, end, target):
    if start <= end:
        mid = start + end - 1 // 2
        if arr[mid] < target:
            return binary_recur(arr, mid + 1, end, target)

        elif arr[mid] > target:
            return binary_recur(arr, start, mid - 1, target)
        else:
            return mid
    else:
        return -1

arr =[2, 3, 4, 10, 40]
target = 10
