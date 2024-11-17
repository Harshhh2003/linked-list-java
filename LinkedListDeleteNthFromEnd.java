public class LinkedListDeleteNthFromEnd {
    node head;

    public static node deleteNthFromEnd(node head, int n) {
        int size = 0;
        node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (n > size) {
            System.out.println("The list has fewer than " + n + " nodes");
            return null;
        }

        if (n == size) {
            head = head.next;
            return head;
        }

        int m = size - n;
        temp = head;
        for (int i = 1; i < m; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
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
        LinkedListDeleteNthFromEnd list = new LinkedListDeleteNthFromEnd();
        list.head = new node(150);
        node second = new node(80);
        node third = new node(60);
        node fourth = new node(90);
        node fifth = new node(20);

        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        list.head = deleteNthFromEnd(list.head, 2);

        node temp = list.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
