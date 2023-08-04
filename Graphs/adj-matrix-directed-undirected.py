def printmatrix(matrix):
    r, c = len(matrix), len(matrix[0])
    for i in range(r):
        for j in range(c):
            print(matrix[i][j], end="\t")
        print()
"""
#undirected graph:
v, e = map(int,input().split())
matrix =[[0]*v for i in range(v)]
for i in range(e):
    u,v = map(str, input().split())
    u = ord(u) - ord('a')
    v = ord(v) - ord('a')
    matrix[u][v] = 1
    matrix[v][u] = 1
"""

#directed graph:
matrix =[[0]*v for i in range(v)]
for i in range(e):
    u,v,w = map(str, input().split())
    u = ord(u) - ord('a')
    v = ord(v) - ord('a')
    w = int(w)
    matrix[u][v] = w

printmatrix(matrix)