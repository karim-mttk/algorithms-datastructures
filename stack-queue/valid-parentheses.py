class Solution:
    def isValid(self, s: str) -> bool:
        if len(s) % 2 == 1:
            return False
        stack = []
        pairs = {')': '(', ']': '[', '}': '{'}
        for char in s:
            if char in pairs.values():
                stack.append(char)
            elif char in pairs.keys():
                if not stack or stack.pop() != pairs[char]:
                    return False
            else:
                return False
        return not stack

class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        pairs = {')': '(', ']': '[', '}': '{'}

        for c in s:
            if c in pairs:
                if stack and stack[-1] == pairs[c]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(c)

        return not stack
