package base;


// 反转单向和双向链表
public class Solution5 {

    private class Node{     //单链表结点
        public int value;
        public Node next;
        public Node(int data) {this.value = data;}
    }

    private class DoubleNode{   //双链表结点
        public int value;
        public DoubleNode last;
        public DoubleNode next;
        public DoubleNode(int data) {this.value = data;};
    }

    //反转单链表
    public Node reverseList(Node head){
        Node pre = null;
        Node next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    //反转双链表
    public DoubleNode reverseDoubleList(DoubleNode head){
        DoubleNode pre = null;
        DoubleNode next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }

}
