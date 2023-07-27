#v1. using replace
class Solution:
    def interpret(self, command: str) -> str:
        newStr = command.replace('()','o').replace('(al)','al')
        return newStr

#v2. using while loop
class Solution:
    def interpret(self, command: str) -> str:
        result = []
        i = 0
        while i < len(command):
            if command[i] == '(':
                if command[i+1] == ')':
                    result.append('o')
                    i += 2
                else:
                    result.append('al')
                    i += 4
            else:
                result.append(command[i])
                i += 1
        return ''.join(result)