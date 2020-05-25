package chao;

/**
 * 两数相加，数值逆序存储在单链表中，每个结点只保存一个数值（0 <= digit <= 9）返回两数之和的链表
 */
public class SinglyLinkedListOfSum {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode listNode = new ListNode(0); //头结点，不保存数据
    ListNode cur = listNode;
    int temp = 0;
    while (l1 != null || l2 != null) {
      int x = (l1 != null) ? l1.val : 0;
      int y = (l2 != null) ? l2.val : 0;
      int sum = temp + x + y;
      temp = sum / 10; //进1
      cur.next = new ListNode(sum % 10); //取余，保存数据的结点
      cur = cur.next;
      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }
    }
    if (temp > 0) {
      cur.next = new ListNode(temp);
    }
    return listNode.next;
  }

}

class ListNode {

  int val;
  ListNode next;

  ListNode(int val) {
    this.val = val;
  }


}