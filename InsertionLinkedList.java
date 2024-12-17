public class InsertionLinkedList {
    public static node insertAtEnd(node head, int x) {
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        node t = new node(x);
        temp.next = t;
        t.prev = temp;
        t.next = null;
        return head;
    }

    public static node insertionAtStart(node head, int x) {
        node t = new node(x);
        t.next = head;
        if (head != null) {
            head.prev = t;
        }
        head = t;
        return head;
    }

    public static void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "   ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static class node {
        int data;
        node next, prev;

        node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        node a = new node(1000);
        node b = new node(101);
        node c = new node(230);
        node d = new node(110);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = null;
        System.out.println("Original linked list:");
        display(a);
        System.out.println("Linked list after insertion at start:");
        a = insertionAtStart(a, 69);
        display(a);
        System.out.println("Linked list after insertion at end:");

        a = insertAtEnd(a, 512);
        display(a);

        
    }
}
