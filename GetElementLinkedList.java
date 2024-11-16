public class GetElementLinkedList {
    node15 head;

    public static class node15 {
        int data;
        node15 next;

        node15(int data) {
            this.data = data;
        }
    }

    void getelement(int idx) {
        if (head == null || idx < 1) {
            System.out.println("Invalid index");
            return;
        }

        node15 temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            if (temp.next == null) {
                System.out.println("Index out of bounds");
                return;
            }
            temp = temp.next;
        }

    
        System.out.println("Element at index " + idx + ": " + temp.data);
    }

    void display() {
        node15 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GetElementLinkedList list = new GetElementLinkedList();
        list.head = new node15(10);
        list.head.next = new node15(20);
        list.head.next.next = new node15(45);

        
        list.display();

    
        list.getelement(2);
    }
}
