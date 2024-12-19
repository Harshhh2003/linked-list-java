public class circularlinklist {
public static class Node {
        int data;
        Node next;
      Node(int data) {
            this.data = data;
        }
    }
 public static void insertAtStart(Node head, int data) {
        Node newNode = new Node(data);
        Node temp = head;
 while (temp.next != head) {     temp = temp.next;
        }   temp.next = newNode;
        newNode.next = head;
    }
  public static void insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        Node temp = head;
 while (temp.next != head) {
            temp = temp.next;
        }
     temp.next = newNode;
        newNode.next = head;
    }

    public static void display(Node head) {
        if (head == null) {
            return;}
            Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(20);
        Node b = new Node(210);
        Node c = new Node(120);
        Node d = new Node(230);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = a;

        display(a);

        insertAtStart(a, 500);
        display(a);

        insertAtEnd(a, 300);
        display(a);
    }
}
