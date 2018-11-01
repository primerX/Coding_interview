package base;

public class Solution4 {
    private class Node{
        public int value;
        public Node next;
        public Node(int data) {this.value = data;}
    }

    // 删除链表的 a / b 结点
    public Node removeByRation(Node head, int a, int b){
        if(a < 1 || a > b){     //删除的位置无效
            return head;
        }
        int n = 0;      //计算链表的结点个数(链表长度)
        Node cur = head;
        while(cur != null){
            n++;
            cur = cur.next;
        }
        //向上取整
        n = (int)Math.ceil( ((double)(a*n)) / (double) b);
        if (n == 1){
            head = head.next;
        }
        if(n > 1){
            cur = head;
            while(--n != 1){
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }
}
