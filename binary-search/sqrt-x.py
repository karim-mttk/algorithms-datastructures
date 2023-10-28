def mySqrt(x: int) -> int:
    i = 1
    j = x//2
    while i <= j:
        mid = (i+j) // 2
        if mid * mid <= x:
            i = mid + 1
        else:
            j = mid - 1
    return j


n = 100
print(mySqrt(n))


