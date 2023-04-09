# v1 with basic count
class Solution:
    def commonFactors(self, a: int, b: int) -> int:
        x = min(a, b)
        count = 0
        for i in range(1, x + 1):
            if (a % i == 0) and (b % i == 0):
                count += 1
        return count

# v2 with sqrt


class Solution:
    def commonFactors(self, a: int, b: int) -> int:
        x = min(a, b)
        count = 0
        for i in range(1, int(x ** 0.5) + 1):
            if (a % i == 0) and (b % i == 0):
                count += 1
            if (i != x // i) and (a % (x // i) == 0) and (b % (x // i) == 0):
                count += 1
        return count
