package com.hhj.leetcode;

/**
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = null;
        ListNode head = null;

        while (true) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            if (ret == null) {
                ret = new ListNode(sum);
                head = ret;
            } else {
                if (ret.val >= 10) {
                    ret.val = ret.val % 10;
                    sum += 1;
                }
                ret.next = new ListNode(sum);
                ret = ret.next;
            }
            if (l1 == null && l2 == null) {
                if (ret.val >= 10) {
                    ret.val = ret.val % 10;
                    sum = 1;
                    ret.next = new ListNode(sum);

                }
                break;
            }
        }
        return head;

    }


    public static void main(String[] args) {

        ListNode a1 = new ListNode(2);
        a1.addNext(new ListNode(4)).addNext(new ListNode(3));
        System.out.println(a1);


        ListNode b1 = new ListNode(5);
        b1.addNext(new ListNode(6)).addNext(new ListNode(4));
        System.out.println(b1);


        System.out.println(addTwoNumbers(a1, b1));
    }
}
