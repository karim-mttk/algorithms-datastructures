def guessNumber(self, n: int) -> int:
    L = 1
    R = n
    while L <= R:
        mid = (L + R) // 2
        result = guess(mid)
        if result > 0:
            L = mid + 1
        elif result < 0:
            R = mid - 1
        else:
            return mid
