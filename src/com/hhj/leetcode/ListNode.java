package com.hhj.leetcode;

public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode setNext(ListNode next){
        this.next = next;
        return this.next;
    }
}
