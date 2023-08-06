import heapq
from collections import defaultdict

#keep track of vertices with cost
#heappop will return least cost vertex
#greedy SRC -> min -> min -> DEST
def shortestPath(graph, src, dest):
    h = []
    heapq.heappush(h,(0,src))
    path = []
    while len(h) !=0:
        currcost, currvtx = heapq.heappop(h)
        if currvtx == dest:
            print(f"Path Exists {src} to {dest} with cost {currcost}")
            break
        for neigh, neighcost in graph[currvtx]:
            heapq.heappush(h, (currcost+neighcost,neigh))

graph = defaultdict(list)
v,e = map(int,input().split())
for i in range(e):
    u,v,w = map(str,input().split())
    graph[u].append((v,int(w)))
src,dest = map(str,input().split())
shortestPath(graph,src,dest)

