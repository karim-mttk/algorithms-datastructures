def nextGreatestLetter(self, letters: List[str], target: str) -> str:
    if target >= letters[-1] or target < letters[0]:
        return letters[0]

    l = 0
    r = len(letters) - 1

    while l <= r:
        mid = (l + r) // 2
        if target >= letters[mid]:
            l = mid + 1
        else:
            r = mid - 1

    return letters[l]
