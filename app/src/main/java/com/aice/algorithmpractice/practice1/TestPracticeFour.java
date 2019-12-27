package com.aice.algorithmpractice.practice1;
//判断一个链表是否有环
public class TestPracticeFour {

    public static boolean isCircle(Node head){
        Node node1=head;
        Node node2=head;
        while (node2!=null&&node1.next!=null){
            node1=node1.getNext();
            node2=node2.getNext().getNext();
            if (node1==node2){
                return true;
            }
        }
        return false;
    }
    public static class Node{
        private int data;
        private Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
