from collections import defaultdict
def dfs(graph, start, visited, path):
    path.append(start)
    visited[start] = True
    for neighbor in graph[start]:
        if visited[neighbor] == False:
            dfs(graph, neighbor, visited, path)
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
traversedPath = dfs(graph, start, visited, path)
print(traversedPath)