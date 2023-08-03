from collections import deque
from collections import defaultdict
"""
7 9
a b
a c
a f 
c e
c f
c d
d e
d g 
g f
"""
def bfs(graph, start, visited, path):
    queue = deque()
    path.append(start)
    queue.append(start)
    visited[start] = True
    while len(queue) != 0:
        tmpnode = queue.popleft()
        for n in graph[tmpnode]:
            if visited[n] == False:
                path.append(n)
                queue.append(n)
                visited[n] = True
    return path

v, e = map(int, input().split())
graph = defaultdict(list)
for i in range(e):
    u,v = map(str, input().split())
    graph[u].append(v)
    graph[v].append(u)

path = []
start = 'a'
visited = defaultdict(bool)
traversedPath = bfs(graph, start, visited, path)
print(traversedPath)