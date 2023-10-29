def arrangeCoins(self, n: int) -> int:
    if n == 1:
        return n

    i = 1
    j = n

    while i <= j:
        mid = (i + j) // 2
        step = (mid / 2) * (mid + 1)
        if step <= n:
            i = mid + 1
        else:
            j = mid - 1
    return j