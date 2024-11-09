public class linklist13 {
    node13 head;

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
    }

    void display() {
        node13 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    int getElement(int idx) {
        node13 temp = head;
        for (int i = 0; i < idx; i++) {
            if (temp == null) {
                System.out.println("Index out of bounds");
                return -1; // Return an error value
            }
            temp = temp.next;
        }
        return (temp != null) ? temp.data : -1;
    }

    public static void main(String[] args) {
        linklist13 list = new linklist13();
        list.insertAt(0, 10);
        list.insertAt(1, 20);
        list.insertAt(2, 30);
        list.insertAt(1, 15);
        list.display();
        System.out.println("Element at index 1: " + list.getElement(1));
    }
}
