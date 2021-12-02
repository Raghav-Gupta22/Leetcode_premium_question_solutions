#problem link on leetcode is https://leetcode.com/problems/minimum-cost-to-connect-sticks/
#problem link on lintcode is https://www.lintcode.com/problem/1872/description 

from heapq import *
class Solution:
    def MinimumCost(self, sticks):
        # write your code here
        ans=0
        heapify(sticks)
        while len(sticks)>1:
            a=heappop(sticks)
            b=heappop(sticks)
            ans+=a+b
            heappush(sticks,a+b)
        return ans
