# convert n to binary
def intToBin(n):
    return str(bin(n))[2:]

# binary to integer
def binToInt(s):
    return int(s, 2)

#kth bit set from right
#1 = SET, 0 = NOT SET
def kthbit(n, k):
    print("Binary: ", str(bin(n))[2:])
    if n & (1 << (k-1)):
        print("SET")
    else:
        print("NOT SET")

#every number occurs more than once, find the single number:
#use xor: n^n = 0, n^0 = n
def findSingle(arr):
    res = arr[0]
    for i in range(1, len(arr)):
        res = res ^ arr[i]
    return res

print("No. of tries: ")
t = int(input())
while t:
    print("Enter integer or array or map no: ")
    arr = list(map(int, input().split()))
    #n, k = map(int, input().split())
    #n = int(input())
    #binstring = intToBin(n)
    #integer = binToInt(binstring)
    #print(n, binstring, integer, n==integer)
    #kthbit(n, k)
    print(findSingle(arr))
    t = t-1
