public class linklist8 {
    public static void display(node8 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static class node8 {
        int data;  
        node8 next;

        node8(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Linklist {
        node8 head = null; 
        node8 tail = null;

        void insertatstarting(int value) {
            node8 temp = new node8(value);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }
    }

    public static void main(String[] args) {
        Linklist l1 = new Linklist();
        l1.insertatstarting(100);
        l1.insertatstarting(23);
        l1.insertatstarting(78);
        l1.insertatstarting(533);
        display(l1.head);
    }
}
