#is power of 2.
#n -> input.
#True/False -> output.
#check if n is a power of 2.
#512 -> True as 512 = 2 ** 9.

#time = O(1)
def isPowerof2(n):
    x = n
    y = not(n & (n-1))
    return x and y

#count no. of ones of binary representation of ints
#the bruteforce method, O(n):
def cntBits1(n):
    s = str(bin(n))[2:]
    print("Binary rep: {}".format(s))
    return s.count('1')

#T.C = O(logn)
def cntBits2(n):
    count = 0
    while n:
        count +=1
        n = n & (n-1)
    return count

print("No. of tests: ")
t = int(input())
while t:
    print("Enter numbers: ")
    n = int(input())
    #print(isPowerof2(n))
    print("Brute force:",cntBits1(n))
    print("Faster method:",cntBits2(n))
    t = t - 1