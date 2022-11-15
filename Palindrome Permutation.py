# Leetocde Link : https://leetcode.com/problems/palindrome-permutation/
# Lintcode Link : https://www.lintcode.com/problem/916/record?fromId=207&_from=collection

from collections import Counter
class Solution:
    def canPermutePalindrome(self, s):
        d=Counter(s)
        count=0
        for i in d.keys():
            if d[i]%2!=0:
                count+=1
        if count<=1:
            return True
        return False
