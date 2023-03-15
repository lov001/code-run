package leetcode.linkedlist.problem160;

import static java.lang.Math.abs;


public class IntersectionOfTwoLinkedListsApproach3LengthDifference {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n = 0;
        int m = 0;
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
        while (ptr1 != null) {
            n++;
            ptr1 = ptr1.next;
        }
        while (ptr2 != null) {
            m++;
            ptr2 = ptr2.next;
        }
        int t = abs(n - m);
        if (n > m) {
            while (t != 0 && headA != null) {
                headA = headA.next;
                t--;
            }
        } else {
            while (t != 0 && headB != null) {
                headB = headB.next;
                t--;
            }
        }
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
