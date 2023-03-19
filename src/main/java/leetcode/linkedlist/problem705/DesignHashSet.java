package leetcode.linkedlist.problem705;

import leetcode.linkedlist.ListNode;

public class DesignHashSet {

    private ListNode head;

    public DesignHashSet() {

    }

    public void add(int key) {
        if (head == null) {
            head = new ListNode(key);
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            if (current.val == key) {
                return;
            }
            current = current.next;
        }
        if (current.val != key) {
            current.next = new ListNode(key);
        }
    }

    public void remove(int key) {
        if (head == null) {
            return;
        }
        while (head != null && head.val == key) {
            head = head.next;
        }
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            if (current.val == key) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
    }

    public boolean contains(int key) {
        ListNode current = head;
        while (current != null) {
            if (current.val == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void print() {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
        System.out.println("<<<<<<<<<<<END>>>>>>>>>>");
    }

    public int length() {
        ListNode current = head;
        int length = 0;
        while (current != null) {
            current = current.next;
            length++;
        }
        return length;
    }
}
