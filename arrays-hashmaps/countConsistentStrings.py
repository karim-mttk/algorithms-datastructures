def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
    hashmap = set(allowed)
    count = 0
    for i in words:
        for n in i:
            if (n not in hashmap):
                count += 1
                break;

    return len(words) - count