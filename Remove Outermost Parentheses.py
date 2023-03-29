#v1 using stack
def removeOuterParentheses(s: str) -> str:
    stack = []
    result = ''
    for c in s:
        if c == '(':
            if stack:
                result += c
            stack.append(c)
        else:
            stack.pop()
            if stack:
                result += c
    return result
