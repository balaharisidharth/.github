// Last updated: 09/02/2026, 13:57:07
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dharun=new ListNode(0,head);
        ListNode empty=dharun;
        while(empty!=null){
            while(empty.next!=null&&empty.next.val==val){
                empty.next=empty.next.next;
            }
            empty=empty.next;
        }
        return dharun.next;
    }
}