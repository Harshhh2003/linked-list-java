class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
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


    public static LinkedList mergeSortedLists(LinkedList list1, LinkedList list2) {
        LinkedList mergedList = new LinkedList();
        Node current1 = list1.head;
        Node current2 = list2.head;

 
        while (current1 != null && current2 != null) {
            if (current1.data < current2.data) {
                mergedList.insert(current1.data);
                current1 = current1.next;
            } else {
                mergedList.insert(current2.data);
                current2 = current2.next;
            }
        }

        // Agar list1 ke remaining nodes hain toh add karo
        while (current1 != null) {
            mergedList.insert(current1.data);
            current1 = current1.next;
        }

        // Agar list2 ke remaining nodes hain toh add karo
        while (current2 != null) {
            mergedList.insert(current2.data);
            current2 = current2.next;
        }

        return mergedList;
    }

    /
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insert(1);
        list1.insert(3);
        list1.insert(5);

        LinkedList list2 = new LinkedList();
        list2.insert(2);
        list2.insert(4);
        list2.insert(6);

        System.out.print("List 1: ");
        list1.display();

        System.out.print("List 2: ");
        list2.display();

        LinkedList mergedList = mergeSortedLists(list1, list2);
        System.out.print("Merged List: ");
        mergedList.display();
    }
}
