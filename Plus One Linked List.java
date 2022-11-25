// Problem link on lintcode:https://www.lintcode.com/problem/904/
// Problem link on leetcode:https://leetcode.com/problems/plus-one-linked-list/

/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    private ListNode reverse(ListNode head){
        ListNode prev = null, curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode plusOne(ListNode head) {
        head = reverse(head);
        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        int carry = 1;
        while(head!=null){
            int s = head.val + carry;
            if( s > 9){
                carry = s/10;
                s = s%10;
            }
            else{
                carry = 0;
            }
            curr.next = new ListNode(s);
            curr = curr.next;
            head = head.next;
        }
        if(carry > 0)
            curr.next = new ListNode(carry);
        return reverse(ans.next);
    }
}
