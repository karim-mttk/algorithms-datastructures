def maxSubArraySum(self, arr, N):
    res = 0
    tot = 0
    for i in range(N):
        tot += arr[i]

        if tot > res:
            res = tot

        if tot < 0:
            tot = 0

    return res
