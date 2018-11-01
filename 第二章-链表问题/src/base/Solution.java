package base;

public class Solution {
    private class Node{     //结点
        public int value;
        public Node next;
        public Node(int data) {value = data;}

        public void printCommonPart(Node head1, Node head2){
            System.out.println("Common part: ");
            while (head1 != null && head2 != null){
                if(head1.value < head2.value){
                    head1 = head1.next;
                }else if(head1.value > head2.value){
                    head2 = head2.next;
                }else{
                    System.out.println(head1.value + " ");
                    head1 = head1.next;
                    head2 = head2.next;
                }
            }
            System.out.println();
        }
    }

}
