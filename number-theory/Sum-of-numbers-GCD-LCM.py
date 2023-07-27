#with time complexity of n, iterating from 1 to n
#example: n=5
# 1+2+3+4+5=15
def sum2(n):
    sm = 0
    #form 1 to n:
    for i in range(1,n+1):
        sm = sm + i
    return sm


# time complexity of O(1):
# using summation
def sum1(n):
    return (n * (n + 1)) // 2

print("select number of tries:")
t = int(input())
while t:
    print("Select 'n':")
    n = int(input())
    print("sum1 executed! output: {}".format(sum1(n)))
    print("sum2 executed! output: {}".format(sum2(n)))
    t=t-1

#From the two different summation programs tested above it seems that sum1
# with the summation function has a lower runtime of O(1) compared to the individual element iteration of O(n)

#Euclidean algorithm
#Time = O(log(min(a,b)))
# product = lcm * gcd
def gcd(a,b):
    if a == 0:
        return b
    return gcd(b%a, a)

def lcm(a,b):
    prod = a*b
    hcf = gcd(a,b)
    return prod // hcf

print("select number of tries:")
t = int(input())
while t:
    print("Select 'n','m':")
    n,m = map(int,input().split())
    print("gcd: {}, lcm: {}".format(gcd(n,m), lcm(n,m)))
    t=t-1
