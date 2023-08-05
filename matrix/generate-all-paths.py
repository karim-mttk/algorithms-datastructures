#dfs - recursion
#current index at matrix[i][j]
#move right, down, diagonal
#backtrack
def findPaths(m,path,i,j):
    r,c = len(m),len(m[0])
    #at final destination print:
    if i == r-1 and j == c-1:
        print(path+[m[i][j]])
        return

    #explore
    path.append(m[i][j])

    #down
    if 0 <= i+1 <= r-1 and 0 <= j <= c-1:
        findPaths(m, path, i+1, j)

    #right
    if 0 <= i <= r-1 and 0 <= j+1 <= c-1:
        findPaths(m, path, i, j+1)

    #diagonal
    if 0 <= i+1 <= r-1 and 0 <= j+1 <= c-1:
        findPaths(m, path, i+1, j+1)

    #backtrack
    path.pop()

mtx = []
print("Enter number of rows:")
n = int(input())
for i in range(n):
    row = list(map(int, input().split()))
    mtx.append(row)

path = []
findPaths(mtx,path,0,0)