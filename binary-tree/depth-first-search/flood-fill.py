# basic flood fill with recursion and array
# the solution is almost similar to the one provieded in the question.
# unclear about the meaning of '4-directionally'
class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        R, C = len(image), len(image[0])
        Ncolor = image[sr][sc]
        if Ncolor == color:
            return image

        def dfs(r, c):
            if image[r][c] == Ncolor:
                image[r][c] = color
                if r >= 1:
                    dfs(r-1, c)
                if r+1 < R:
                    dfs(r+1, c)
                if c >= 1:
                    dfs(r, c-1)
                if c+1 < C:
                    dfs(r, c+1)

        dfs(sr, sc)
        return image
