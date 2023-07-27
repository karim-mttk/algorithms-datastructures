#Time = O(n)
def approach1(n):
    divcnt = 0
    for i in range(1, n+1):
        if n%i == 0:
            divcnt +=1
    #print("No of factors: ",divcnt)
    if divcnt != 2:
        return False
    return True

# Time = O(1)
from math import *
def approach2(n):
    if n == 0 or n == 1:
        return False
    if n == 2 or n == 3:
        return True
    if n%2 == 0 or n%3 == 0:
        return False
    for i in range (5, int(sqrt(n))+1):
        if n%i == 0 or n%(i+2) == 0:
            return False
    return True

print("No. of tests:")
t = int(input())
while t:
    print("Enter number:")
    n = int(input())
    #print("Frist method:",approach1(n))
    print("Second method:",approach2(n))
    t = t-1