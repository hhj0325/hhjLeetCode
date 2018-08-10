package com.hhj.leetcode;

public class ListNode {

    int val;
    ListNode next;

    ListNode(){

    }

    ListNode(int x) {
        val = x;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode addNext(ListNode next) {
        this.next = next;
        return next;
    }

    @Override
    public String toString() {
        String ret = "";
        ListNode tmp = this;
        while (tmp != null){
            ret += tmp.val;
            tmp = tmp.next;
        }
        return ret;
    }
}
