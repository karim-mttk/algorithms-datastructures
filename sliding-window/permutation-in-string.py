# using array:

# 1.s1map: This is an array used to count the frequency of characters in s1.
# 2.ord(s1[i]): This converts the character at index i of s1 to its corresponding ASCII code.
# 3.ord('a'): This gets the ASCII code of the lowercase letter 'a'.
# 4.ord(s1[i]) - ord('a'): This subtracts the ASCII code of 'a' from the ASCII code of the character at index i of s1. This produces an integer between 0 and 25,
# which can be used as an index into s1map.
# 5.s1map[ord(s1[i]) - ord('a')]: This accesses the element in s1map at the index computed in step 4.
# 6+= 1: This increments the value stored in the element of s1map that was accessed in step 5. This effectively counts the frequency of the character.
# So, s1map[ord(s1[i]) - ord('a')] += 1 counts the frequency of the character at index i of s1 by incrementing the corresponding element in s1map.

class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False
        s1map = [0] * 26
        for i in range(len(s1)):
            s1map[ord(s1[i]) - ord('a')] += 1
        for i in range(len(s2) - len(s1) + 1):
            s2map = [0] * 26
            for j in range(len(s1)):
                s2map[ord(s2[i+j]) - ord('a')] += 1
            if self.matches(s1map, s2map):
                return True
        return False

    def matches(self, s1map, s2map):
        for i in range(26):
            if s1map[i] != s2map[i]:
                return False
        return True
