def binary_itr(arr, start, end, target):
    if start <= end:
        mid = (start + end) // 2
        if arr[mid] < target:
            start = mid + 1

        elif arr[mid] > target:
            end = mid - 1
        else:
            return mid

    return start

arr =[2, 3, 4, 10, 40]
target = 10

print(binary_itr(arr, 0, len(arr) - 1, target))