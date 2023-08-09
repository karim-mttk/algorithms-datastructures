if __name__ == '__main__':
    arr = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        arr.append([name, score])
    res = []
    low = 1000
    for i in range(len(arr)):
        if low > arr[i][1]:
            low = arr[i][1]
    for i in range(len(arr)):
        if arr[i][1] == low:
            res.append(arr[i][0])
    res.sort()
    for i in res:
        print(i)
