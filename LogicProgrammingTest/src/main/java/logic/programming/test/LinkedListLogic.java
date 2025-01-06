//package logic.programming.test;
//
//
//import java.nio.file.Path;
//import java.util.LinkedList;
//
//class Node{
//    int head;
//    Node next;
//
//
//    public Node(int head) {
//        this.head = head;
//        this.next = null;
//    }
//}
//
//public class LinkedListLogic {
//
//    private Node head;
//
//    public LinkedListLogic() {
//        this.head = null;
//    }
//
//    public void appendData(int data){
//        if (head == null){
//            head = new Node(4);
//            return;
//        }
//
//        Node current = head;
//
//        while (current != null){
//            current = current.next;
//        }
//        current.next = new Node(data);
//    }
//
//
//    public void reverse(){
//        Node prev = null;
//        Node current = head;
//        Node next = null;
//
//        while (current != null){
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
//        head = prev;
//
//
//    }
//
//
//    public void display(){
//        Node current = head;
//        while (current != null){
//            System.out.println(+" -> ");
//            current = current.next;
//        }
//        System.out.println("null");
//    }
//
//}
//
//
//class LinkedListMain{
//    public static void main(String[] args) {
//        LinkedListLogic linkedListLogic = new LinkedListLogic();
//        linkedListLogic.appendData(1);
//        linkedListLogic.appendData(2);
//        linkedListLogic.appendData(3);
//        linkedListLogic.appendData(4);
//
//        System.out.println("original Linked List : ");
//        linkedListLogic.display();
//
//        linkedListLogic.reverse();
//
//        System.out.println("reverse Linked List : ");
//        linkedListLogic.reverse();
//    }
//}
