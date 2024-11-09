public class linkedlist12 {
    node12 head; 


    static void display(node12 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }


    public static class node12 {
        int data;
        node12 next;

        node12(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    void insertat(int idx, int value) {
        node12 t = new node12(value); 
        node12 temp = head; 

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

    public static void main(String[] args) {
        linkedlist12 list = new linkedlist12(); 
        list.head = new node12(10);
        list.head.next = new node12(20);
        list.head.next.next = new node12(30);

        display(list.head);

        
        list.insertat(1, 15);
        list.insertat(2, 1000);
        display(list.head);
    }
}
