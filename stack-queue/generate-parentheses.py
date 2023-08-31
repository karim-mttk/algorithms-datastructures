def generateParenthesis(self, n: int) -> List[str]:
    stack = []
    res = []

    def backTrack(openN, closed):
        if openN == closed == n:
            res.append("".join(stack))
            return

        if openN < n:
            stack.append("(")
            backTrack(openN + 1, closed)
            stack.pop()

        if closed < openN:
            stack.append(")")
            backTrack(openN, closed + 1)
            stack.pop()

    backTrack(0, 0)
    return res