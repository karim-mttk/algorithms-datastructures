
arr=[6,4,3,2,5,6]
m = max(arr)
no_max = [i for i in arr if i != m]
res = max(no_max)
print(res)