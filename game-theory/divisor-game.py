# v1 with if else statements:
class Solution:
    def divisorGame(self, n: int) -> bool:
        if (n % 2) is 0:
            return True
        else:
            return False


# v2 one liner:

class Solution2:
    def divisorGame(self, n: int) -> bool:
        return n % 2 == 0
