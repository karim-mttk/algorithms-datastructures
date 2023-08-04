#using 
class Solution:
    def longestPalin(self, S):
        L=[]
        for i in range(len(S)):
            for j in range(i,len(S)):
                L.append(S[i:j+1])
        ans=""
        for i in range(len(L)):
            if L[i]==L[i][::-1] and len(L[i])>len(ans):
                ans=L[i]
        return ans
