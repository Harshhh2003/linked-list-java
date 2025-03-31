public class linklist14 {
    node13 head;
    int size = 0; 

    public static class node13 {
        int data;
        node13 next;

        node13(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insertAt(int idx, int val) {
        node13 t = new node13(val);
        if (idx == 0) { 
            t.next = head;
            head = t;
            size++;
            return;
        }
        node13 temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            if (temp == null) {
                System.out.println("Index out of bounds");
                return;
            }
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
        size++; // Increment size 
    }

    void deleteat(int idx) {
        if (head == null || idx < 0 || idx >= size) {
            System.out.println("Index out of bounds");
            return;
        }

        if (idx == 0) { 
            head = head.next;
            size--; // Decrement size after deletion
            return;
        }

        node13 temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            size--; 
        }
    }

    void display() {
        node13 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linklist14 list = new linklist14();
        list.insertAt(0, 10);
        list.insertAt(1, 20);
        list.insertAt(2, 30);
        list.display();
        list.deleteat(1);
        list.display();
    }
}
