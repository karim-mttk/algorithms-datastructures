# using brute force. Time complexity = O(n * log2n)
def countBits(self, n: int) -> List[int]:
    res = [0] * (n + 1)
    for i in range(n + 1):
        count = 0
        for c in bin(i):
            if c == '1':
                count += 1
        res[i] = count
    return res

# using bit manipulation T.C = O(n)
class Solution:
    def countBits(self, num: int) -> List[int]:
        counter = [0]
        for i in range(1, num+1):
            counter.append(counter[i >> 1] + i % 2)
        return counter
