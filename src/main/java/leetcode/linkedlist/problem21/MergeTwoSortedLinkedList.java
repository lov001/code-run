package leetcode.linkedlist.problem21;

public class MergeTwoSortedLinkedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode head, p;
        if (list1.val <= list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }
        p = head;
        while (list1 != null && list2 != null) {
            if (list2.val <= list1.val) {
                p.next = list2;
                p = list2;
                list2 = list2.next;
            } else {
                p.next = list1;
                p = list1;
                list1 = list1.next;
            }
        }
        if (list1 != null) {
            while (list1 != null) {
                p.next = list1;
                p = list1;
                list1 = list1.next;
            }
        } else {
            while (list2 != null) {
                p.next = list2;
                p = list2;
                list2 = list2.next;
            }
        }
        return head;
    }
}
