public class InsertionAtAnyIndex {
    public static node insertAtIndex(node head, int x, int index) {
        node t = new node(x);

   
        if (index == 0) {
            t.next = head;
            if (head != null) {
                head.prev = t;
            }
            head = t;
            return head;
        }

        node temp = head;
        int count = 0;

   
        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

      
        if (temp != null) {
            t.next = temp.next; 
            if (temp.next != null) {
                temp.next.prev = t;  
            }
            temp.next = t; 
            t.prev = temp; 
        } else {
            System.out.println("Index out of bounds");
        }

        return head;
    }

    public static void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
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

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;

        System.out.println("Original linked list:");
        display(a);

        a = insertAtIndex(a, 69, 2); 
        System.out.println("Linked list after insertion:");
        display(a);
    }
}
