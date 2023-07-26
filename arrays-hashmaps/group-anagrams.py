def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
    res = defaultdict(list)

    for s in strs:
        count = [0] * 26  # from a to z
        for c in s:
            count[ord(c) - ord("a")] += 1  # count how many chars in s
        res[tuple(count)].append(s)

    return res.values()