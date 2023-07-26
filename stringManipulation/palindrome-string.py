def isPalindrome(self, S):
    if len(S) == 1:
        return 1

    i = 0
    j = len(S) - 1
    while i < j:
        if S[i] != S[j]:
            return 0
        i += 1
        j -= 1
    return 1

