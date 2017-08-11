package com.leetcode.medium.problem;

/**
 * Created by zhao on 2017/8/11.<br/>
 * You are given two non-empty linked lists representing two non-negative integers. <br/>
 * The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.<br/>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.<br/>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)<br/>
 * Output: 7 -> 0 -> 8
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution2 {

    public static void main(String[] args) {
        /*ListNode a1 = new ListNode(2);
        ListNode ah = a1;
        ListNode a2 = a1.next = new ListNode(4);
        ListNode a3 = a2.next = new ListNode(3);

        ListNode b1 = new ListNode(5);
        ListNode bh = b1;
        ListNode b2 = b1.next = new ListNode(6);
        ListNode b3 = b2.next = new ListNode(4);
        ListNode b4 = b3.next = new ListNode(1);*/

        ListNode a1 = new ListNode(5);
        ListNode ah = a1;

        ListNode b1 = new ListNode(5);
        ListNode bh = b1;

        ListNode p = new Solution2().addTwoNumbers(ah, bh);
        while (p != null) {
            System.out.print(p.val + ",");
            p = p.next;
        }
        System.out.println();

    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return new ListNode(0);
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode newList = new ListNode(0);
        ListNode newHead = newList;
        int a = 0;//进位
        while (true) {
            int m = (l1 != null) ? l1.val : 0;
            int n = (l2 != null) ? l2.val : 0;
            newList.val = (m + n + a) % 10;
            a = (m + n + a) / 10;
            newList.next = new ListNode(0);

            l1 = (l1 != null) ? l1.next : l1;
            l2 = (l2 != null) ? l2.next : l2;
            if (l1 == null && l2 == null) {
                newList.next = (a == 0) ? null : new ListNode(a);//如果 5 和 5 相加 进位，需要把进位作为最后一个节点
                break;
            }
            newList = newList.next;
        }

        return newHead;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}