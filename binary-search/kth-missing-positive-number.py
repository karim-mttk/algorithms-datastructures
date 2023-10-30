#brute force
def findKthPositive(self, arr: List[int], k: int) -> int:
    a = []
    i = 1

    while len(a) < k:
        if i not in arr:
            a.append(i)
        i += 1

    return a[-1]


