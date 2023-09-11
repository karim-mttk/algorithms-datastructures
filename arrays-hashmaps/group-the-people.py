def groupThePeople(self, groupSizes: List[int]) -> List[List[int]]:
    g = {}
    res = []

    for i, n in enumerate(groupSizes):
        if n not in g:
            g[n] = []
        g[n].append(i)
        if len(g[n]) == n:
            res.append(g[n])
            g[n] = []

    return res