public class CircularLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    public static void display(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;

       
            if (temp == head) {
                break;
            }
        }
    
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
    }
}
