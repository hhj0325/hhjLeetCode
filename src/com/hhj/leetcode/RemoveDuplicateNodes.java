package com.hhj.leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNodes {
    public static ListNode removeDuplicateNodes(ListNode head) {
        if(head == null){
            return null;
        }
        Set<Integer> duSet = new HashSet<>();
        duSet.add(head.val);
        ListNode end = head.next;
        ListNode start = head;
        while (end != null){
            if(duSet.add(end.val)){
                start.next = end;
                start = end;
            }
            else {
                start.next = null;
            }
            end = end.next;

        }
        return head;

    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(1);
        node1.setNext(node2)
                .setNext(node3)
                .setNext(node4)
                .setNext(node5)
                .setNext(node6);

        ListNode ret = RemoveDuplicateNodes.removeDuplicateNodes(node1);

        while (ret != null) {
            System.out.println(ret.val);
            ret = ret.next;
        }
    }
}
