package base;

public class Solution2 {
    private class Node{     //单链表结点
        public int value;
        public Node next;
        public Node(int data) {this.value = data;}
    }

    private class DoubleNode{       //双链表结点
        public int value;
        public DoubleNode last;
        public DoubleNode next;
        public DoubleNode(int data) {this.value = data;}
    }

    //删除单链表中倒数第 K 个结点
    public Node removeLastKthNode(Node head, int lastKth){
        if(head == null || lastKth < 1){
            return head;
        }
        Node cur = head;
        while(cur != null){
            lastKth--;
            cur = cur.next;
        }
        if(lastKth == 0){
            head = head.next;
        }
        if(lastKth < 0){
            cur = head;
            while(++lastKth != 0){
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }

    //删除双链表中倒数第 K 个结点
    public DoubleNode removeLastKthNode(DoubleNode head, int lastKth){
        if(head == null || lastKth < 1){
            return head;
        }
        DoubleNode cur = head;
        while(cur != null){
            cur = cur.next;
            lastKth--;
        }
        if(lastKth == 0){
            head = head.next;
            head.last = null;
        }
        if(lastKth < 0){
            cur = head;
            while(++lastKth != 0){
                cur = cur.next;
            }
            DoubleNode newNext = cur.next.next;
            cur.next = newNext;
            if(newNext != null){
                newNext.last = cur;
            }
        }
        return head;
    }
}
