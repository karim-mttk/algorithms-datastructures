def isPerfectSquare(self, num: int) -> bool:
    if num == 1:
        return True

    sqrt_num = int(num ** 0.5)
    return sqrt_num * sqrt_num == num


    def PerfectSquare(self, num: int) -> bool:
        if num == 1:
            return True

        i = 2
        j = num // 2
        while i <= j:
            mid = (i+j) // 2
            sq = mid * mid
            if sq == num:
                return True
            elif sq < num:
                i = mid + 1
            else:
                j = mid - 1
        return False