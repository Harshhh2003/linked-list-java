public class linklist11 {
    node11 head;

    public static void display(node11 head) {
        node11 current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static class node11 {
        int data;
        node11 next;

        node11(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insertAt(int idx, int val) {
        node11 newNode = new node11(val);

        if (idx == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        node11 temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Index out of bounds");
                return;
            }
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        linklist11 list = new linklist11();
        list.insertAt(0, 10);
        list.insertAt(1, 20);
        list.insertAt(2, 30);
        list.insertAt(1, 15);

        display(list.head);
    }
}
