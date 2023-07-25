#method 1 using iteration
def reverseList(L):
    start = 0
    end = len(L) - 1
    while start < end:
        L[start], L[end] = L[end], L[start]
        start += 1
        end -= 1

A = [1,2,3,4,5,6,7,8]
print(A)
reverseList(A)
print("Reversed list is: ")
print(A)