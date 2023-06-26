public class Day57
{
    public class ListNode 
    {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0, head);
        ListNode prev = temp;

        for (; head != null; head = head.next)
            if (head.val != val) {
                prev.next = head;
                prev = prev.next;
         }
        prev.next = null; // In case the last val == val

    return temp.next;
    }
}