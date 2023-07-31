def rotate(arr, n):
    temp = arr[n - 1]
    for i in range(n - 1, 0, -1):
        arr[i] = arr[i - 1]
    arr[0] = temp
A = [1,2,3,4,5,6]
N = len(A)
B = rotate(A, N)


