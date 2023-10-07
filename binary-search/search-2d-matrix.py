print(divmod(7, 2))


def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
    if not matrix:
        return False

    L = 0
    m = len(matrix)
    n = len(matrix[0])
    R = m * n - 1

    while L <= R:
        mid = (L + R) // 2
        mRow, mCol = divmod(mid, n)

        if matrix[mRow][mCol] == target:
            return True
        elif matrix[mRow][mCol] < target:
            L = mid + 1
        else:
            R = mid - 1
    return False