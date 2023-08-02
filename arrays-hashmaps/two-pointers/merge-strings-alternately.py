def mergeAlternately(self, word1: str, word2: str) -> str:
    strng = []
    miniLen = min(len(word1), len(word2))

    for i in range(miniLen):
        strng.append(word1[i])
        strng.append(word2[i])

    strng.extend(word1[miniLen:])
    strng.extend(word2[miniLen:])

    return "".join(strng)