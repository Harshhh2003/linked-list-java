class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList9 {
    Node head;


    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Value search karne ka method
    public int search(int key) {
        Node current = head;
        int index = 0;

        while (current != null) {
            if (current.data == key) {
                return index;  // Value mil gayi, toh index return karo
            }
            current = current.next;
            index++;
        }
        return -1;  // Value nahi mili, toh -1 return 
    }

  
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList9 list = new LinkedList9();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.print("Linked List: ");
        list.display();

        int key = 30;
        int index = list.search(key);

        if (index != -1) {
            System.out.println("Value " + key + " found at index " + index);
        } else {
            System.out.println("Value " + key + " not found in the list");
        }
    }
}
