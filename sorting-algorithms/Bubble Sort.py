#v1
def bubble_optimized(A):
    ite = 0
    for i in range(len(A)):
        for j in range(len(A) - 1 - i):
            if A[j] > A[j + 1]:
                A[j], A[j + 1] = A[j + 1], A[j]
                ite += 1
    return A, ite
