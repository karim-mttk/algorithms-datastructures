#v1. with modulo. time complexity: O(1)-not dependent on the size of the number
def smallestEvenMultiple(self, n: int) -> int:
    if (n%2==0):
      return n
    else:
      return n*2  

#v2. with gcd
def smallestEvenMultiple(self, n: int) -> int:
    return (2 * n) // math.gcd(2, n)          