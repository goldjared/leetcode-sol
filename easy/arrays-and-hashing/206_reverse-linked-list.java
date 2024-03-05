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
        if(head == null) return head;
        ListNode currentNode = head;
        List<ListNode> arrListNodes = new ArrayList<>();
        while(currentNode != null) {
            arrListNodes.add(currentNode);
            currentNode = currentNode.next;
        }

        int n = arrListNodes.size()-1;        
        ListNode newHead = arrListNodes.get(n);
        currentNode = newHead;

        while(n>0) {
            ListNode newNode = arrListNodes.get(--n);
            currentNode.next = newNode;
            currentNode = newNode;
        }

        currentNode.next = null;
        return newHead;
    }
}
