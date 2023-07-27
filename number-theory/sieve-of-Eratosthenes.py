#Generate All primes upto N in Time: O(n * log(logn))
#**Basic method:**
#Traverse and check every number if it is a prime number. Time: O(n * root(n))
from math import *
def genprimes(n):
    primes = [True]*(n+1)
    primes[0] = False
    primes[1] = False
    for p in range(2,int(sqrt(n))+1):
        if primes[p] == True:
            for i in range (p*p, n+1, p):
                primes[i] = False
    for i in range(0, len(primes)):
        if primes[i] == True:
            print(i, end=" ")


print("No. of tests:")
t = int(input())
while t:
    print("Enter number:")
    n = int(input())
    print("Frist method:",genprimes(n))
    #print("Second method:",approach2(n))
    t = t-1