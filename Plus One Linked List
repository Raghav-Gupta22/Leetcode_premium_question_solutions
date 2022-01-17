Problem link on lintcode:https://www.lintcode.com/problem/904/
Problem link on leetcode:https://leetcode.com/problems/plus-one-linked-list/



"""
Definition of ListNode
class ListNode(object):
    def __init__(self, val, next=None):
        self.val = val
        self.next = next
"""

class Solution:
    """
    @param head: the first Node
    @return: the answer after plus one
    """
    def plusOne(self, head):
        d=dummynode=ListNode(0)
        dummynode.next=head
        notnine=ListNode(0)
        temp=d
        while d!=None:
            if d.val!=9:
                notnine=d
            d=d.next
        notnine.val+=1
        notnine=notnine.next
        while notnine!=None:
            notnine.val=0
            notnine=notnine.next
        if dummynode.val==0:
            return temp.next
        else:
            return temp

