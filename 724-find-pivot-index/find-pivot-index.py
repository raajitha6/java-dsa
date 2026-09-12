class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        n=len(nums)
        if sum(nums[1:])==0:
            return 0
        for i in range(1,n-1):
            s1=sum(nums[:i])
            s2=sum(nums[i+1:])
            if s1==s2:
                return i
        if sum(nums[:n-1])==0:
            return n-1
        return -1


        