def evalRPN(self, tokens: List[str]) -> int:
    res = []

    for s in tokens:
        if s == '/':
            a = res.pop()
            b = res.pop()
            res.append(trunc(b / a))
        elif s == '+':
            a = res.pop()
            b = res.pop()
            res.append(b + a)
        elif s == '-':
            a = res.pop()
            b = res.pop()
            res.append(b - a)
        elif s == '*':
            a = res.pop()
            b = res.pop()
            res.append(b * a)
        else:
            res.append(int(s))

    return res[0]

