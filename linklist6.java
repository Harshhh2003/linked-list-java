public class linklist6 {

    public static class Node6 {
        int data; 
        Node6 next; 

        Node6(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void count(Node6 head) {
        int count = 0; 
        Node6 current = head; 

        while (current != null) { 
            count++; 
            current = current.next; 
        }

        System.out.println("Count of nodes: " + count); 
    }
    
    public static void display(Node6 head) {
        if (head == null) return; 
        System.out.println(head.data); 
        display(head.next); 
    }
    
    public static void main(String[] args) {
        Node6 y = new Node6(150);
        Node6 z = new Node6(80);
        Node6 a = new Node6(10);
        Node6 b = new Node6(90);
        Node6 h = new Node6(20);
        
        y.next = z;
        z.next = a;
        a.next = b;
        b.next = h;
        
        count(y);
        
        System.out.println("Linked List:");
        display(y);
    }
}
