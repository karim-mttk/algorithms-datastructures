def divisibleSumPairs(n, k, ar):
    res = 0
    ar.sort()
    for i in range(n - 1):
        for j in range(i+1, n):  # Change n-1 to n
            if (ar[i] + ar[j]) % k == 0 and i != j:  # Check i != j
                res += 1
    return res


#version 2
def divisibleSumPairs(n, k, ar):
    remainder_count = {}
    res = 0

    for num in ar:
        remainder = num % k
        needed_remainder = (k - remainder) % k
        if needed_remainder in remainder_count:
            res += remainder_count[needed_remainder]

        if remainder in remainder_count:
            remainder_count[remainder] += 1
        else:
            remainder_count[remainder] = 1

    return res
