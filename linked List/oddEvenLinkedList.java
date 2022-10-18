// Simple Explanation:

// We need to attach odd nodes with odd ones. So, to do this operation, we will attach head.next to head.next.next
// In the same loop, we will attach even nodes with the even ones. So, do this operation, attach sec.next to sec.next.next. Here sec is holding the second position node.
// We will run this loop till
// head is not null
// head.next is not null
// head.next.next is not null
// Finally to will get two separated Listnodes,
// first is containing the odd position node and second is containing the even position node.

// Attach first listNode to sec.
// And return first listNode.

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null)return head;
        ListNode res=head;
        ListNode second=head.next;
        ListNode sec=head.next;
        while(head!=null && head.next!=null && head.next.next!=null){
            head.next=head.next.next;
            head=head.next;
            if(sec!=null && sec.next!=null){
                sec.next=sec.next.next;
                sec=sec.next;
            }
        }
        head.next=second;
        return res;
    }
}