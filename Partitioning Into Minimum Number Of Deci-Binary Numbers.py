#Given a string n that represents a positive decimal integer,
# return the minimum number of positive deci-binary numbers needed so that they sum up to n.

#v1. one liner
class Solution:
    def minPartitions(self, n: str) -> int:
        return int(max(n))

#v2. with a for loop 
class Solution:
    def minPartitions(self, n: str) -> int:
        return int(max(int(digit) for digit in n))