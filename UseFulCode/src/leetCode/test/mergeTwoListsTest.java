package leetCode.test;

public class mergeTwoListsTest {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public static void main(String[] args) {

    }

    /*
     *
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     * */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode head = dummyHead;

        while (l1 != null || l2 != null) {
            if (null == l1) {
                head.next = l2;
                break;
            }
            if (null == l2) {
                head.next = l1;
                break;
            }
            if (l1.val <= l2.val) {
                head.next = l1;
                l1 = l1.next;
                head = head.next;
            } else if (l1.val > l2.val) {
                head.next = l2;
                l2 = l2.next;
                head = head.next;
            }
        }
        return dummyHead.next;

    }

}
