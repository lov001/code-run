package leetcode.linkedlist.problem141;

import java.util.HashSet;

public class LinkedListCycleSetApproach {

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> listNodeHashSet = new HashSet<>();
        while (head != null) {
            if (listNodeHashSet.contains(head)) {
                return true;
            }
            listNodeHashSet.add(head);
            head = head.next;
        }
        return false;
    }
}
