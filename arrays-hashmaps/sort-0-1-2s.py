#three pointer solution
def sort012(self, arr, n):
    p1 = 0
    i = 0
    p2 = n-1

    while i <= p2:
        if arr[i] == 0:
            arr[p1], arr[i] = arr[i], arr[p1]
            i += 1
            p1 += 1
        elif arr[i] == 2:
            arr[p2], arr[i] = arr[i], arr[p2]
            p2 -= 1
        else:
            i += 1