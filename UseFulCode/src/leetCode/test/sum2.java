package leetCode.test;

import java.util.LinkedList;

public class sum2 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l11 = new ListNode(8);
		l1.next = l11;
		l11.next = null;
		

		ListNode l2 = new ListNode(0);
		l2.next = null;

		ListNode ans = addTwoNumbers2(l1, l2);
		while (ans.next != null) {
			System.out.print(ans.val + " ");
			ans = ans.next;
		}
	}

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}


	/**
	 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
	 * 输出：7 -> 0 -> 8
	 * 原因：342 + 465 = 807
	 * */
	public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
		//初始化伪头部
		ListNode dummyHead = new ListNode(0);

	    ListNode p = l1, q = l2, curr = dummyHead;

	    //初始化进位值
	    int carry = 0;
	    while (p != null || q != null) {

	    	//若节点不为空，则取到该节点的值，否则为0
	        int x = (p != null) ? p.val : 0;
	        int y = (q != null) ? q.val : 0;

	        //将两个链表对应位置相加，若上个位置发生进位，carry为1，也算入这次运算
	        int sum = carry + x + y;

	        //若不超过10，则carry是0，若大于等于10则为1
	        carry = sum / 10;

	        //将sum对10取余并作为下个节点的值
	        curr.next = new ListNode(sum % 10);
	        curr = curr.next;

	        //往后移动
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }

	    //如果发生进位，则carry就是进位值，若前面的最后一次运算发生进位，则在最后添加一个节点，值为carry
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    //返回伪头部的next，就是链表表头（伪头部的值并不参与运算，它的next就是我们需要的链表的表头）
	    return dummyHead.next;

	}
}
