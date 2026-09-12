class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        cdt=0
        cnt=0
        for i in nums:
            if cnt==0:
                cdt=i
            if i==cdt:
                cnt+=1
            else:
                cnt-=1
        return cdt
        