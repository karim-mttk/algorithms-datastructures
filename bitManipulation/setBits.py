def setBits(self, N):
    count = 0
    while N:
        count += 1
        N = N & (N-1)
    return count