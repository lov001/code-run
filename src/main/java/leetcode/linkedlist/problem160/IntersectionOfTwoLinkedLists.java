package leetcode.linkedlist.problem160;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<ListNode> list1 = new ArrayList<>();
        ListNode ptr1 = headA, ptr2 = headB;
        int intersection = 0;
        boolean intersected = false;
        while (ptr1 != null) {
            list1.add(ptr1);
            ptr1 = ptr1.next;
        }
        while (ptr2 != null) {
            if (list1.contains(ptr2)) {
                intersected = true;
                break;

            }
            ptr2 = ptr2.next;
            intersection++;
        }
        if (intersected) {
            ListNode temp = headB;
            while (intersection != 0) {
                temp = temp.next;
                intersection--;
            }
            return temp;
        }
        return null;
    }
}
