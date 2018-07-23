package com.leetcode.test;

public class test21 {

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(4);
		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(5);
		mergeTwoLists(list1,list2);
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		if(l1.val<l2.val){
			l1.next=mergeTwoLists(l1.next,l2);
			return l1;
		}else{
			l2.next=mergeTwoLists(l1,l2.next);
			return l2;
		}
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
