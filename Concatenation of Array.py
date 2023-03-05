#basic concatenation runtime of O(n^2)   
def getConcatenation(self, nums: List[int]) -> List[int]:
        n=len(nums)
        l=[]
        for i in range(0, n):
            l.insert(i,nums[i])
            l.insert(n+i,nums[i])
        return l 
        

#same program with a runtime of O(n)
def getConcatenation(self, nums: List[int]) -> List[int]:
        n = len(nums)
        l = [0] * (n * 2)
        for i in range(n):
            l[i] = nums[i]
            l[n + i] = nums[i]
        return l