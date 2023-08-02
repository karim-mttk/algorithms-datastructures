def getMinDiff(self, arr, n, k):
    arr.sort()
    res = arr[n - 1] - arr[0]

    smallest = arr[0] + k
    largest = arr[-1] - k

    for i in range(n - 1):
        mini = min(smallest, arr[i + 1] - k)
        maxi = max(largest, arr[i] + k)
        if mini < 0:
            continue
        res = min(res, maxi - mini)
    return res