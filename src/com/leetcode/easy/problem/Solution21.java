package com.leetcode.easy.problem;

/**
 * Created by zhao on 2017/8/10.<br/>
 * Merge two sorted linked lists and return it as a new list. <br/>
 * The new list should be made by splicing together the nodes of the first two lists.<br/>
 */
public class Solution21 {

    public static void main(String[] args) {
        ListNode first1 = new ListNode(0);
        ListNode rear1 =first1;

        for(int i=9;i>=1;i--){
            ListNode q= new ListNode(i);
            rear1.next=q;
            rear1=q;
        }
        ListNode q=first1;
        while(q!=null){
            System.out.print(q.val+ ",");
            q=q.next;
        }
        System.out.println();
        Solution21 sl = new Solution21();
        sl.sortList(first1);

        ListNode p=first1;
        while(p!=null){
            System.out.print(p.val+ ",");
            p=p.next;
        }
        System.out.println();
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head;
        ListNode rear;
        rear = head = new ListNode(-1);
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                rear.next = l1;
                rear = l1;
                l1 = l1.next;
            } else {
                rear.next = l2;
                rear = l2;
                l2 = l2.next;
            }
        }
        if (l1 != null)
            rear.next = l1;
        if (l2 != null)
            rear.next = l2;


        return head.next;
    }

    private ListNode sortList(ListNode head){
        /*
         * 实现链表的合并排序：1、将链表划分成基本相等的两个链表
         * 2、递归将这两个链接继续划分，直到链表的长度为0或者1为止
         * 3、调用Merge（）将链接进行合并
         */

        if(head==null||head.next==null)
            return head;
        ListNode mid =head;
        ListNode pos =mid.next;
        while(pos!=null){
            pos=pos.next;
            if(pos!=null){
                pos=pos.next;
                mid=mid.next;
            }
        }
        ListNode q=sortList(mid.next);
        mid.next=null;
        return mergeTwoLists(sortList(head), q);
    }

}

