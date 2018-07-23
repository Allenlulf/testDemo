package com.niuke.jzoffer;

import java.util.ArrayList;

/**
 * 从尾到头打印链表
 * 输入一个链表。从尾到头打印链表每一个节点值
 * @author lulf
 */
public class cwdtdylb {
	
	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(3);
		listNode.next.next = new ListNode(4);
		listNode.next.next.next = new ListNode(0);
		cwdtdylb s=new cwdtdylb();
		System.out.println(s.printListFromTailToHead(listNode));
	}
	
	ArrayList<Integer> arrayList = new ArrayList<Integer>();

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		if (listNode != null)
		{
			this.printListFromTailToHead(listNode.next);
			arrayList.add(listNode.val);
		}
		return arrayList;
	}
}

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}
