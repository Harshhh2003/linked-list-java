



public class LinkedListNthFromEnd {  
    node head;
    
    public static node nthnodelast(node head, int n) {
        int size = 0;
        node temp = head;
        
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        
        if (n > size) {
            System.out.println("The list has fewer than " + n + " node");
            return null;
        }
        int m = size - n + 1;
        temp = head;
        for (int i = 1; i < m; i++) {
            temp = temp.next;
        }
        return temp;
    }
  
    public static class node {
        int data; 
        node next;
        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        node y = new node(150);
        node z = new node(80);
        node a = new node(60);
        node b = new node(90);
        node h = new node(20);
        
        y.next = z;
        z.next = a;
        a.next = b;
        b.next = h;
        node result = nthnodelast(y, 4);
        if (result != null) {
            System.out.println("The 4th node from the end is: " + result.data);
        }
    }
}