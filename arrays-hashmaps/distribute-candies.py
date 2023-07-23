# solution 1: using dicitonary
def distributeCandies(self, candyType: List[int]) -> int:
    di = {}
    for i in candyType:
        if i not in di:
            di[i] = 1
        else:
            di[i] += 1
    if len(di) == 1:
        return 1
    can = int(len(candyType) // 2)
    return min(can, len(di))

#solution 2 using hashset + less code
def distributeCandies(self, candyType: List[int]) -> int:
    types = len(set(candyType))
    can = int(len(candyType)/2)
    return min(can,types)