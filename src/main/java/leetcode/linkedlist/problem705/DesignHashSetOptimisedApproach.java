package leetcode.linkedlist.problem705;


public class DesignHashSetOptimisedApproach {

    private static final int ARRAY_SIZE = 1000;
    private final ListNode[] arr;

    public DesignHashSetOptimisedApproach() {
        arr = new ListNode[ARRAY_SIZE];
    }

    public void add(int key) {
        int index = getIndex(key);
        ListNode node = findNode(index, key);
        if (node == null) {
            ListNode newNode = new ListNode(key);
            newNode.next = arr[index];
            arr[index] = newNode;
        }
    }

    public void remove(int key) {
        int index = getIndex(key);
        ListNode prev = null;
        ListNode curr = arr[index];
        while (curr != null) {
            if (curr.val == key) {
                if (prev == null) {
                    arr[index] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public boolean contains(int key) {
        int index = getIndex(key);
        ListNode node = findNode(index, key);
        return node != null;
    }

    private int getIndex(int key) {
        return key % ARRAY_SIZE;
    }

    private ListNode findNode(int index, int key) {
        ListNode node = arr[index];
        while (node != null) {
            if (node.val == key) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

}
