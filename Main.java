class Node {
    int data;
    Node next;
 Node(int data) {
        this.data = data;
        this.next = null;
    }
}class LinkedList {
    Node head;
     void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return; }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}public class Main { 
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); 
  list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
 list.display();
    }
}
