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
    public ListNode reverseList(ListNode head) {
        //null -> 1 -> 2 -> 3 -> 4 -> 5 -> null
        //처음 이전 노드는 null
        ListNode prevNode = null;

        //null <- 1 <- 2 <- 3 <- 4 <- 5 <- null
        while(head != null) {
            ListNode nextNode = head.next;
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
        }
        return prevNode;
    }
}