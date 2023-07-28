#brute-force by checking all elements in two arrays
def doUnion(self, a, n, b, m):
    hashmap = {}

    for i in (a):
        if i not in hashmap:
            hashmap[i] = 1
        hashmap[i] += 1

    for i in (b):
        if i not in hashmap:
            hashmap[i] = 1
        hashmap[i] += 1

    return len(hashmap)

#one-liner
def doUnion(self, a, n, b, m):
    return len(set(a) | set(b))

