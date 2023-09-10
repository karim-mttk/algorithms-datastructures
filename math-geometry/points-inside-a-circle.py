def countPoints(self, points: List[List[int]], queries: List[List[int]]) -> List[int]:
    res = []
    for i in queries:
        count = 0
        for j in points:
            r = math.sqrt((j[0] - i[0]) ** 2 + (j[1] - i[1]) ** 2)
            if r <= i[2]:
                count += 1
        res.append(count)

    return res