#v1.  time complexity of O(n^2)
def leftRigthDifference(self, nums: List[int]) -> List[int]:
        l = []
        for i in range(len(nums)):
            left_sum = sum(nums[:i])
            right_sum = sum(nums[i+1:])
            l.append(abs(left_sum - right_sum))
        return l    

#v2. time complexity of O(1)
def leftRigthDifference(self, nums: List[int]) -> List[int]:
        ans=[0]
        for i in nums: ans+=[ans[-1]+i]
        l=[]
        for i in range(1,len(ans)):
            l+=[abs(ans[-1]-ans[i]-ans[i-1])]   
        return l          