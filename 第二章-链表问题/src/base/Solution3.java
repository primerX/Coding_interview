package base;

public class Solution3 {

    private class Node{         //声明结点
        public int value;
        public Node next;
        public Node(int data) {this.value = data;}
    }

    //移除中间结点
    public Node removeMidNode(Node head){
        if(null == head || head.next == null){   //空节点或者只有一个结点
            return head;
        }
        if(head.next.next == null){     //两个结点的情况
            return head.next;
        }
        Node pre = head;
        Node cur = head.next.next;
        while(cur.next != null && cur.next.next != null){
            pre = pre.next;
            cur = cur.next.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}
