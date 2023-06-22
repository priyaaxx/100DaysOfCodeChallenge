public class Day53
{
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;

        ListNode res = null;

        while (currA != null) 
        {
            currB = headB;
            while (currB != null) 
            {
                if (currA == currB) 
                {
                    return currA;
                }

            currB = currB.next;
            }
            currA = currA.next;
        }
    return res;
    }
}